# Campfire Overhaul Mod

A Fabric mod for Minecraft 1.20.4 that makes campfire creation more immersive and interactive!

## Features

### 🪓 The Chopping Stump
- Craft a **Stump** from 3 logs in a row
- Place any log on the stump by right-clicking
- Right-click again to **chop** the log into 4 firewood pieces

### 🪵 Firewood
- **Placeable & Stackable**: Place firewood on the ground, stack up to 4 pieces
- **Fuel Source**: Works as furnace fuel (200 ticks = 10 seconds, smelts 1 item)
- **Authentic Look**: Uses exact campfire log dimensions and textures

### 🔥 Building a Campfire

**Step-by-step World Placement:**
1. Stack 4 firewood on the ground
2. Right-click with ANY fuel source (coal, charcoal, planks, sticks, etc.)
3. Light it using one of the primitive methods below → 🔥 Campfire!

### 🧯 Primitive Fire-Starting Methods

Multiple ways to light your campfire, from desperate survival to reliable tools:

| Method | Item Required | Difficulty | Notes |
|--------|---------------|------------|-------|
| **Hand Drill** | Sticks | Hardest | Rub sticks together - primitive survival |
| **Flint Sparking** | Flint | Medium | Strike flint to create sparks |
| **Bow Drill** | Any Bow | Easier | Use bow friction - more reliable |
| **Flint & Steel** | Flint & Steel | Instant ✨ | The goal - 100% reliable ignition |
| **Fire Charge** | Fire Charge | Instant | Consumed on use |

**Progression Feel:**
```
[Desperate] Sticks → Unreliable, tedious
     ↓
[Basic] Flint → Better sparks, still chance-based
     ↓
[Improved] Bow Drill → Good success rate
     ↓
[Reliable] Flint & Steel → 100% success! ✨
```

Each primitive method shows visual feedback:
- **Smoke particles** during friction attempts
- **Spark particles** when striking flint
- **Ember buildup** as you get closer to success
- **Flame burst** on successful ignition

### ⚡ Fuel Flexibility
- Accept **any furnace fuel** to prepare firewood stacks
- Works with: Coal, Charcoal, Wood Planks, Sticks, Blaze Rods, etc.
- Lava Bucket excluded for safety

## Gameplay Flow

```
[3 Logs] ──crafting──> [Stump]

[Any Log] + [Stump] ──right-click──> [Log on Stump]

[Log on Stump] ──right-click──> [4x Firewood]

[Firewood] ──place & stack──> [4 Firewood Pile]

[4 Firewood] + [Any Fuel] ──right-click──> [Unlit Campfire]

[Unlit Campfire] + [Sticks/Flint/Bow/Flint&Steel] ──right-click──> 🔥 Campfire!
```

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.20.4
2. Install [Fabric API](https://modrinth.com/mod/fabric-api)
3. Download the mod JAR from releases
4. Place in your `.minecraft/mods` folder
5. Launch the game!

## Building from Source

See [BUILDING.md](BUILDING.md) for detailed build instructions.

```bash
git clone https://github.com/sahil-tgs/Immersive-Campfire.git
cd Immersive-Campfire
./gradlew build
```

## Requirements

- Minecraft 1.20.4
- Fabric Loader 0.15.6+
- Fabric API 0.95.3+

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for project vision, design principles, and implementation guidelines.

**Important**: This mod prioritizes immersive world-interaction over crafting-table convenience. Please read the contributing guide before adding features.

## License

MIT License - See [LICENSE](LICENSE) for details.
