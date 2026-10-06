# Essentials

Essential tools, mods and workarounds for Pixels and other Androids

> **This is a personal fork of [sameerasw/essentials](https://github.com/sameerasw/essentials)**, based on upstream commit `cd95f8d`. All credit for the app goes to the original author. The upstream links, badges and wiki below still point to the original project.

## What is different in this fork

The following features are removed to keep the app smaller and to drop things that do not work well on current Pixels running Android 17:

- Maps power saving mode
- Notification lighting and edge lighting
- Are we there yet? (location reached alarms and the travel compass)
- Flashlight pulse
- Island (dynamic island)
- Duo overlay
- All Watch features, including WearOS calendar sync, and the Wear OS and location Gradle dependencies

Other changes:

- Fixed the Pixel searchbar "widget" style. Picking a widget no longer cancels the selection on newer Android versions, and the "display over other apps" permission is requested first because the widget is read through a hidden overlay.
- Removed the code, settings keys, view-model state, permissions and docs that only existed for the removed features.

The fork has not been built or tested on a device yet, so expect rough edges. Without Shizuku or root, the Pixel searchbar change may need a manual Pixel Launcher restart to show up.

---

## Navigation

- [Features](https://github.com/sameerasw/essentials/wiki)
- [Requirements](https://github.com/sameerasw/essentials/wiki/Installation#system-requirements)
- [Installation](#installation)
- [Shell Providers (Shizuku & Root)](#shell-providers-shizuku--root)
- [Accessibility Permissions](#how-to-grant-accessibility-permissions)
- [Localization](#localization)


# Installation

During the installation, you probably will see a warning similar to this claiming that the app is blocked during installation with no way to continue at all.

This is a new restriction on Android with sideloaded apps that can receive sensitive permissions such as Accessibility or Notification Listener, which Essentials both may utilize.

- You can still proceed avoiding this, but you will have to temporarily disable Google Play Protect during the installation.
- But then again, you may notice the toggle for Play Protect in the Play Store being enabled and grayed out, not allowing to be disabled. This is due to the "Advanced protection" feature in Pixels that entirely blocks sideloading. So you will have to disable "Advanced Protection" as well.
- Follow the steps in the upstream project to avoid it during the installation.


> ### IMPORTANT: Yes, this is very annoying, but I understand the need of such prevention to avoid users installing potentially harmful apps from unknown sources. Well I hope you trust me to install my app but anyways, you should always verify the trusted source before installing any APK file from the internet. ʅ(°_°)ʃ

# Shell Providers (Shizuku & Root)

- Essentials supports both **Shizuku** and **Root** as shell providers for executing advanced system-level commands.
- **Shizuku**: Make sure to get the latest version of Shizuku preferably from a fork such as [rushiranpise/Shizuku-Next](https://github.com/rushiranpise/Shizuku-Next) or other not from the Google Play as it is no longer well supported.
- **Root**: If your device is rooted, Essentials can bypass Shizuku and use root privileges directly for features like Button Remap and App Freezing.

# How to grant accessibility permissions

# Localization

## How to translate?
Help us bring Essentials to more people around the world! If you're fluent in another language, you can contribute by translating the strings in-app.

### Validating Translations

Before submitting translation PRs, validate your changes using the local validation script to ensure proper formatting and XML syntax:

```bash
# Validate all translation files for syntax, escaping & placeholder errors
python3 scripts/validate_strings.py

# Auto-fix quote and percent escaping issues automatically
python3 scripts/validate_strings.py --fix
```

---

<p align="center">
  Last updated: 2026-08-08
</p>
