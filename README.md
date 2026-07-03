# Dashchan_2 Extensions

## Русский

Этот репозиторий содержит расширение Dvach для Dashchan_2.

Dashchan_2 использует отдельный package name и отдельный механизм обнаружения
расширений, поэтому это расширение ставится отдельно от старых расширений
оригинального Dashchan.

Контакт для связи: `dashchan_2@mail.ru`

### Текущее расширение

| Компонент | Значение |
| --- | --- |
| Название APK | `Dashchan_2 for 2ch` |
| Package | `io.dashchan2.chan.dvach` |
| Extension feature | `chan.extension.dashchan2` |
| Java package | `com.mishiranu.dashchan.chan.dvach` |
| Версия | `1.43-experimental-1.6-r10`, code `7` |
| Минимальный Android | API 30 / Android 11+ |
| Update metadata | `//raw.githubusercontent.com/andrewpozdnakov7-jpg/Dashchan_2/master/update/data.json` |

### Что изменено

- Расширение Dvach переведено на package `io.dashchan2.chan.dvach`.
- Добавлен feature flag `chan.extension.dashchan2` для Dashchan_2.
- Android label изменен на `Dashchan_2 for 2ch`.
- URI handler label изменен на `Dashchan_2`.
- Сохранена внутренняя Java-структура `com.mishiranu.dashchan.chan.dvach`.
- Добавлена совместимость с known-extension loading path в Dashchan_2.
- Обновлена загрузка captcha под текущий emoji captcha API 2ch.
- Исправлено имя JSON-поля проверки emoji captcha:
  `captchaTokenID`.
- Устаревшие ветки активного captcha flow удалены.
- Минимальная версия Android поднята до API 30 / Android 11+.
- Сборка обновлена до Android Gradle Plugin 9.2.1 и Gradle 9.4.1.
- В этом репозитории оставлено только расширение Dvach; остальные расширения
  удалены из текущей ветки.

### Сборка

Требуется:

- JDK 17 или новее;
- Android SDK Platform 36;
- Android SDK Build Tools 36.0.0;
- Gradle 9.4.1.

Команда сборки:

```sh
../tools/gradle-9.4.1/bin/gradle :extensions:dvach:assembleRelease
```

APK появится в:

```text
extensions/dvach/build/outputs/apk/release
```

### Подпись APK

Для локальной подписи можно создать `keystore.properties` в корне репозитория:

```properties
store.file=%PATH_TO_KEYSTORE_FILE%
store.password=%KEYSTORE_PASSWORD%
key.alias=%KEY_ALIAS%
key.password=%KEY_PASSWORD%
```

Не добавляйте настоящий `keystore.properties` и файлы ключей в git.

### Лицензия

Расширение распространяется по лицензии
[GNU General Public License, version 3 or later](COPYING).

---

## English

This repository contains the Dvach extension for Dashchan_2.

Dashchan_2 uses its own package name and extension-discovery path, so this
extension is installed separately from the old original Dashchan extensions.

Contact: `dashchan_2@mail.ru`

### Current Extension

| Component | Value |
| --- | --- |
| APK label | `Dashchan_2 for 2ch` |
| Package | `io.dashchan2.chan.dvach` |
| Extension feature | `chan.extension.dashchan2` |
| Java package | `com.mishiranu.dashchan.chan.dvach` |
| Version | `1.43-experimental-1.6-r10`, code `7` |
| Minimum Android | API 30 / Android 11+ |
| Update metadata | `//raw.githubusercontent.com/andrewpozdnakov7-jpg/Dashchan_2/master/update/data.json` |

### Changes

- Moved the Dvach extension to package `io.dashchan2.chan.dvach`.
- Added the Dashchan_2 feature flag `chan.extension.dashchan2`.
- Changed the Android label to `Dashchan_2 for 2ch`.
- Changed the URI handler label to `Dashchan_2`.
- Kept the internal Java package structure
  `com.mishiranu.dashchan.chan.dvach`.
- Added compatibility with Dashchan_2 known-extension loading.
- Updated captcha loading for the current 2ch emoji captcha API.
- Fixed the emoji captcha verification JSON field name:
  `captchaTokenID`.
- Removed stale branches from the active captcha flow.
- Raised the minimum Android version to API 30 / Android 11+.
- Updated the build stack to Android Gradle Plugin 9.2.1 and Gradle 9.4.1.
- Kept only the Dvach extension in this repository branch; other extensions
  were removed from the current branch.

### Building

Requirements:

- JDK 17 or newer;
- Android SDK Platform 36;
- Android SDK Build Tools 36.0.0;
- Gradle 9.4.1.

Build command:

```sh
../tools/gradle-9.4.1/bin/gradle :extensions:dvach:assembleRelease
```

The APK will be written to:

```text
extensions/dvach/build/outputs/apk/release
```

### APK Signing

For local signing, create `keystore.properties` in the repository root:

```properties
store.file=%PATH_TO_KEYSTORE_FILE%
store.password=%KEYSTORE_PASSWORD%
key.alias=%KEY_ALIAS%
key.password=%KEY_PASSWORD%
```

Do not commit the real `keystore.properties` file or signing keys.

### License

The extension is available under the
[GNU General Public License, version 3 or later](COPYING).
