# Dashchan_2 Extensions

## Русский

Этот репозиторий содержит расширения Dvach и Fourchan для Dashchan_2.

Dashchan_2 использует отдельный package name и отдельный механизм обнаружения
расширений, поэтому эти расширения ставятся отдельно от старых расширений
оригинального Dashchan.

Контакт для связи: `dashchan_2@mail.ru`

### Текущие расширения

| Компонент | Package | Версия | Возможности |
| --- | --- | --- | --- |
| Dvach | `io.dashchan2.chan.dvach` | `1.43-r12`, code `9` | Чтение и публикация |
| Fourchan | `io.dashchan2.chan.fourchan` | `1.27-read-only-1`, code `1` | Только чтение |

Оба расширения используют feature `chan.extension.dashchan2` и требуют
API 30 / Android 11+.

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
- В репозиторий добавлено отдельное read-only расширение Fourchan для
  просмотра разделов и тредов.
- Добавлен домен `2ch.org` в locator и Android manifest hosts.
- Добавлена разметка AI-сгенерированных постов для скрытия в Dashchan_2.
- Gradle plugin DSL обновлен под современный assignment-синтаксис Gradle 9.

### Сборка

Требуется:

- JDK 17 или новее;
- Android SDK Platform 36;
- Android SDK Build Tools 36.0.0;
- Gradle 9.4.1.

Команда сборки:

```sh
../tools/gradle-9.4.1/bin/gradle \
  :extensions:dvach:assembleRelease \
  :extensions:fourchan:assembleRelease
```

APK появится в:

```text
extensions/dvach/build/outputs/apk/release
extensions/fourchan/build/outputs/apk/release
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

Исходники расширений основаны на Dashchan Extensions и включают изменения,
изученные и адаптированные из `TrixiEther/DashchanFork` /
`TrixiEther/Dashchan-Library`.

Расширения распространяются по лицензии
[GNU General Public License, version 3 or later](COPYING).

---

## English

This repository contains the Dvach and Fourchan extensions for Dashchan_2.

Dashchan_2 uses its own package name and extension-discovery path, so this
extensions are installed separately from the old original Dashchan extensions.

Contact: `dashchan_2@mail.ru`

### Current Extensions

| Component | Package | Version | Capabilities |
| --- | --- | --- | --- |
| Dvach | `io.dashchan2.chan.dvach` | `1.43-r12`, code `9` | Reading and posting |
| Fourchan | `io.dashchan2.chan.fourchan` | `1.27-read-only-1`, code `1` | Read-only |

Both extensions use the `chan.extension.dashchan2` feature and require
API 30 / Android 11+.

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
- Added a separate read-only Fourchan extension for browsing boards and
  threads.
- Added the `2ch.org` domain to the locator and Android manifest hosts.
- Added AI-generated post marking for hiding in Dashchan_2.
- Updated the Gradle plugin DSL to the modern Gradle 9 assignment syntax.

### Building

Requirements:

- JDK 17 or newer;
- Android SDK Platform 36;
- Android SDK Build Tools 36.0.0;
- Gradle 9.4.1.

Build command:

```sh
../tools/gradle-9.4.1/bin/gradle \
  :extensions:dvach:assembleRelease \
  :extensions:fourchan:assembleRelease
```

The APK will be written to:

```text
extensions/dvach/build/outputs/apk/release
extensions/fourchan/build/outputs/apk/release
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

The extension sources are based on Dashchan Extensions and include changes
studied and adapted from `TrixiEther/DashchanFork` /
`TrixiEther/Dashchan-Library`.

The extensions are available under the
[GNU General Public License, version 3 or later](COPYING).
