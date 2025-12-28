# Contributing to Campfire Overhaul

## Project Vision

**Campfire Overhaul** transforms the mundane crafting-table campfire creation into an **immersive, multi-step world interaction**. The core philosophy is: **building should feel physical, not menu-based**.

## 🎯 Core Design Principles

### 1. World Interaction Over Crafting Tables
- **NO crafting table recipes** for campfire-related items (except the Stump)
- Players should physically place, stack, and interact with blocks in the world
- The journey of building a campfire should feel tangible and satisfying

### 2. Realistic Progression
The campfire building process mirrors real-life:
```
Chop wood → Stack firewood → Add kindling/fuel → Light with spark
```

### 3. Vanilla Integration
- The end result is a **vanilla Minecraft campfire**
- We enhance the *creation process*, not replace the campfire itself
- Use vanilla textures where possible for consistency

### 4. Simplicity Over Complexity
- Each step should be intuitive
- No complex machinery or multi-block structures
- A new player should figure it out through experimentation

## ❌ What This Mod is NOT

| Don't Do This | Why |
|---------------|-----|
| Crafting table recipes for campfire/unlit campfire | Defeats the immersive world-building purpose |
| Custom campfire block with different behavior | We use vanilla campfire as the end product |
| Complex crafting chains | Keep it simple: chop → stack → fuel → light |
| Tech/machinery elements | This is a primitive/survival enhancement |
| Magic or fantasy elements | Keep it grounded and realistic |

## ✅ What This Mod IS

| Do This | Why |
|---------|-----|
| World-placed block interactions | Core immersive experience |
| Right-click mechanics | Intuitive Minecraft interactions |
| Visual feedback (particles, block states) | Player understands progress |
| Sound feedback | Satisfying chopping/placing/friction sounds |
| Vanilla texture usage | Consistent with base game |
| Progressive difficulty | Reward player advancement |

## 📦 Current Features

### Blocks
| Block | Purpose | Obtained |
|-------|---------|----------|
| **Stump** | Workbench for chopping logs | Crafted: 3 logs in a row |
| **Firewood Stack** | Stackable firewood (1-4) | Placed from Firewood item |
| **Unlit Campfire** | Ready-to-light campfire | Firewood stack + fuel |

### Items
| Item | Purpose | Obtained |
|------|---------|----------|
| **Firewood** | Building material for campfire | Chopping logs on stump (4 per log) |

### Mechanics

#### Log Chopping
- Place log on stump → Right-click → Get 4 firewood

#### Firewood Stacking
- Place firewood → Right-click with more → Stacks up to 4

#### Fuel Addition
- Right-click 4-stack with ANY furnace fuel → Unlit campfire

#### Primitive Fire-Starting (NEW!)
Multiple ignition methods with realistic progression:

| Method | Item | Success Rate | Cost | Visual Feedback |
|--------|------|--------------|------|-----------------|
| **Hand Drill** | Sticks | ~15% | 1 stick/attempt | Smoke → Embers |
| **Flint Sparking** | Flint | ~25% | 30% chance to consume | Sparks → Embers |
| **Bow Drill** | Any Bow | ~40% | 2 durability/attempt | Smoke → Flames |
| **Flint & Steel** | Flint & Steel | 100% ✨ | 1 durability | Instant ignition |
| **Fire Charge** | Fire Charge | 100% | Consumed | Instant ignition |

**Visual Feedback System:**
- Particles spawn on EVERY attempt (player knows it's working)
- Smoke/sparks intensity increases with each attempt
- Small flames appear as ignition approaches
- Success triggers flame burst + lava ember particles

**Progression Philosophy:**
Getting iron for Flint & Steel should feel like a genuine quality-of-life upgrade after struggling with primitive methods.

### Fuel System
- Accepts ANY item registered as furnace fuel
- **Exception**: Lava bucket (excluded for safety/logic)
- Uses Fabric's FuelRegistry for compatibility

## 🗺️ Roadmap (Future Features)

### Overhaul Mode (Planned)
- Disable vanilla campfire crafting recipe via mixin
- Force players to use the immersive method
- Config option to toggle

### Fire-Starting Enhancements (In Progress)
- [ ] Improved Hand Drill mechanic (hold to charge?)
- [ ] Custom sounds for each ignition method
- [ ] Weather affecting success rates (rain = harder)
- [ ] Biome-specific modifiers

### Other Enhancements (Ideas)
- [ ] Axe requirement for chopping (tool check)
- [ ] Chopping animation/particles
- [ ] Different wood types = different firewood textures
- [ ] Smoke signals from unlit campfire (smoldering state)
- [ ] Campfire cooking integration

## 🏗️ Technical Architecture

```
com.example.simpleblocks/
├── SimpleBlocksMod.java      # Main entry point
├── ModBlocks.java            # Block registration
├── ModItems.java             # Item registration  
├── ModItemGroups.java        # Creative tab integration
├── block/
│   ├── StumpBlock.java       # Chopping workbench
│   ├── FirewoodBlock.java    # Stackable firewood
│   └── UnlitCampfireBlock.java # Pre-lit campfire + ignition system
└── item/
    └── FirewoodItem.java     # Placeable firewood item
```

### Key Block States
- `StumpBlock`: `has_log` (boolean) - whether a log is placed on it
- `FirewoodBlock`: `count` (1-4) - number of firewood pieces stacked
- `UnlitCampfireBlock`: `facing` (direction) - inherited by vanilla campfire

### Ignition System (UnlitCampfireBlock)
- `DEV_MODE` flag for testing (10 clicks = guaranteed fire)
- `attemptCounts` map tracks player attempts per block position
- `getIgnitionChanceModifier()` - hook for future weather integration
- Separate particle methods for attempts vs success

## 🔧 Implementation Guidelines

### When Adding New Features:

1. **Ask**: Does this require a crafting table? If yes, reconsider.
2. **Ask**: Can this be done through world interaction? If yes, do that.
3. **Ask**: Does this match the realistic campfire-building theme?
4. **Ask**: Is this simple enough for a new player to discover?
5. **Ask**: Does this provide visual/audio feedback?

### Code Style
- Use Fabric API where available
- Follow vanilla Minecraft patterns
- Add comments explaining non-obvious mechanics
- Use descriptive method names
- Keep ignition methods extensible for future additions

### Testing Checklist
- [ ] Works in Survival mode
- [ ] Works in Creative mode
- [ ] Sounds play correctly
- [ ] Particles display on attempts
- [ ] Block states change visually
- [ ] Items drop correctly when broken
- [ ] No crafting table shortcuts exist
- [ ] All ignition methods work

## 📝 Commit Message Format

```
<type>: <short description>

- Detail 1
- Detail 2
```

Types: `feat`, `fix`, `refactor`, `docs`, `style`

## 🤝 For AI Agents

If you're an AI helping with this project:

1. **Read this document first** before implementing features
2. **Never add crafting table recipes** for campfire components
3. **Preserve the immersive world-interaction philosophy**
4. **Always provide visual feedback** for player actions
5. **When in doubt, ask** rather than assume
6. **Check existing code patterns** before adding new systems
7. **Keep ignition system extensible** for future methods/modifiers

The goal is an immersive, physical campfire-building experience - not convenience shortcuts.
