# Paper plugin Gradle template

Template code for setting up a `1.21.8` Paper plugin with Gradle.

I use this for my personal work.
You may use it too, if you find it useful.
Keep in mind this is an overengineered template.
Consider only using this as inspiration.

A simple Maven setup will often suffice.

## Contents

- Bootstrapper setup
- Brigadier command setup
- Auto generate `paper-plugin.yml`
- Run Paper server with Gradle
- Build options configured with `gradle.properties`
- Dependencies configured with `libs.versions.toml`
- Build logic stuffed away in convention plugins

## Rebrand

Files to insert your plugin's branding:

| Location                | Edit               |
|-------------------------|--------------------|
| `./settings.gradle.kts` | `rootProject.name` |
| `./gradle.properties`   | All properties     |
| `./paper/src/main/java` | Package name       |

## Thanks to

[PaperMC](https://github.com/PaperMC) for the [Paper](https://github.com/PaperMC/Paper) server software.

[jpenilla](https://github.com/jpenilla) for [resource-factory](https://github.com/jpenilla/resource-factory) and [run-task](https://github.com/jpenilla/run-task).

[radoslaw-panuszewski](https://github.com/radoslaw-panuszewski) for [typesafe-conventions](https://github.com/radoslaw-panuszewski/typesafe-conventions-gradle-plugin).