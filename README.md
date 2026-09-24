# Prime Sanctums Fabric 1.20.1

Fabric mod source for Prime Sanctums P-1 + P-2 v13.

## Commands

- `/primes p1 start` and `/primes p2 start`
- `/primes p1 reset` and `/primes p2 reset`
- `/primes p1 status`
- `/primes p1 music_stop` and `/primes p2 music_stop`

Commands require operator permission. Original `/function p1:start` and `/function p2:start` remain available.

## Build

Place **both original archives** in the root of this repository with these exact names:

- `PRIME_SANCTUMS_P1_P2_v13_1.20.1_DATAPACK(1).zip`
- `PRIME_SANCTUMS_P1_P2_v13_1.20.1_RESOURCEPACK(1).zip`

The GitHub Actions workflow unpacks their `data/` and `assets/` directories, copies resource-pack `pack.png` as the mod icon, builds with Java 17 and Gradle 8.8, and uploads a mod JAR as an artifact. The mod requires Fabric API on Minecraft 1.20.1.

The original archives are **not yet in the repository**. Until both are uploaded, the workflow intentionally fails its asset check and cannot produce a working mod.
