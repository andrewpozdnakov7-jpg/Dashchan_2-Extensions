# Dashchan Extensions

This repository contains supported Dashchan extensions.

Old extensions are placed under their own specific branch. It is planned to move
them all into the master branch.

## Dashchan_2 R17 Dev1 Dvach Variant

This branch contains a local Dashchan_2-compatible build of the Dvach extension.
It is intentionally separated from the original Dashchan extension so it can be
installed next to the normal application.

| Field | Value |
| --- | --- |
| Android package | `io.dashchan2.chan.dvach` |
| Extension feature | `chan.extension.dashchan2` |
| App label | `Dashchan_2 for 2ch` |
| URI handler label | `Dashchan_2` |
| Version | `1.43-experimental-1.6-r10`, code `7` |
| Minimum Android | API 30 / Android 11+ |

### What Was Added

- Separate Android package for the Dashchan_2 extension:
  `io.dashchan2.chan.dvach`.
- Separate extension feature flag: `chan.extension.dashchan2`.
- Dashchan_2 labels for Android package manager and URI handling.
- Compatibility with the Dashchan_2 client package and its known-extension
  loading path.
- Java classes and extension metadata remain under
  `com.mishiranu.dashchan.chan.dvach`; only the APK package id is changed.

### What Was Updated

- Updated the Dvach extension version from `1.43-experimental-1.6` to
  `1.43-experimental-1.6-r10`.
- Updated `versionCode` to `7`.
- Switched captcha loading to the current 2ch emoji captcha API.
- Removed the old captcha settings lookup from the captcha load path because the
  legacy `2chcaptcha` endpoint currently returns HTTP 404.
- Normalized stale or unknown stored captcha choices to `emoji_captcha`.
- Removed dead legacy captcha branches from the active Dvach posting flow.
- Fixed the emoji captcha check JSON field from `captchaTokenId` to
  `captchaTokenID`, matching the current API schema.
- Updated the extension build stack to Android Gradle Plugin 9.2.1 and Gradle
  9.4.1 through local `library` submodule changes documented in
  `docs/library-submodule-local-changes.md`.
- Raised the extension minimum SDK to API 30 / Android 11+.

## Building Guide

1. Install JDK 17 or higher.
2. Install Android SDK Platform 36 and SDK Build Tools 36.0.0.
3. Define `ANDROID_HOME` / `ANDROID_SDK_ROOT`, or set `sdk.dir` in
   `local.properties`.
4. Use Gradle 9.4.1.

For the current Dashchan_2 Dvach package, run:

```sh
../tools/gradle-9.4.1/bin/gradle :extensions:dvach:assembleRelease
```

The resulting APK file will appear in
`extensions/dvach/build/outputs/apk/release`.

### Build Signed Binary

You can create `keystore.properties` in the source code directory with the following properties:

```properties
store.file=%PATH_TO_KEYSTORE_FILE%
store.password=%KEYSTORE_PASSWORD%
key.alias=%KEY_ALIAS%
key.password=%KEY_PASSWORD%
```

## License

Extensions are available under the [GNU General Public License, version 3 or later](COPYING).
