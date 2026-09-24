# Prime Sanctums Fabric 1.20.1

Fabric mod source for the supplied Prime Sanctums P-1 + P-2 v13 datapack and resource pack.

## Commands

- `/primes p1 start` and `/primes p2 start`
- `/primes p1 reset` and `/primes p2 reset`
- `/primes p1 status`
- `/primes p1 music_stop` and `/primes p2 music_stop`

Commands require operator permission. The original `/function p1:start` and `/function p2:start` remain available.

## Assets required before building

The original pack assets have **not yet been uploaded to this repository**. Copy `data/` from `PRIME_SANCTUMS_P1_P2_v13_1.20.1_DATAPACK(1).zip` and `assets/` from `PRIME_SANCTUMS_P1_P2_v13_1.20.1_RESOURCEPACK(1).zip` into `src/main/resources/`. Copy resource pack `pack.png` to `src/main/resources/assets/primes/icon.png`. Do not copy pack metadata or old README files.

The GitHub Actions workflow checks for those files and only builds once they are present. Use Java 17 and Fabric API for Minecraft 1.20.1. Run `gradle build` (Gradle 8.8), or download the JAR from the successful workflow artifact.
