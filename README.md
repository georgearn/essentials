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


<p align="center">
<img width="99%" alt="essentials" src="https://github.com/user-attachments/assets/b14e1067-a414-42fd-80c5-6d1f6086ab38" />
</p>

<p align="center">
  <a href="https://www.reddit.com/r/MadebySameerasw"><img  width="49%"  alt=" reddit-banner" src="https://github.com/user-attachments/assets/a5197458-d64a-4c6a-a6a3-9e1f36030205" /></a>
  <a href="https://t.me/tidwib"><img  width="49%"  alt=" telegram-banner" src="https://github.com/user-attachments/assets/425b3cc1-9ac6-46ec-8f48-71c7af9c9ca2" /></a>
</p>


<br>

<p align="center">
  <a href="https://github.com/sameerasw/essentials/releases/latest"><img alt="GitHub Downloads (specific asset, all releases)" src="https://img.shields.io/github/downloads/sameerasw/essentials/app-release.apk?displayAssetName=false&style=for-the-badge&logo=android&logoColor=%23fff&labelColor=%2348C&color=%2348C">      
</a>
  <a href="https://github.com/sameerasw/essentials/issues/new?template=bug_report.md"><img alt="GitHub Issues or Pull Requests by label" src="https://img.shields.io/github/issues/sameerasw/essentials/bug?style=for-the-badge&logo=openbugbounty&logoColor=%23fff&label=bug%3F&labelColor=%232a6&color=%232a6">
</a>
  <a href="https://github.com/sameerasw/essentials/issues/new?template=feature_request.md"><img alt="GitHub Issues or Pull Requests by label" src="https://img.shields.io/github/issues/sameerasw/essentials/enhancement?style=for-the-badge&logo=apachespark&logoColor=%23fff&label=Feature%20request&labelColor=%23a26&color=%23a26">
</a>
  <a href="https://sameerasw.com/essentials"><img src="https://img.shields.io/badge/Website-orange?style=for-the-badge&logo=googlechrome&logoColor=%23000&labelColor=%233AFFB8&color=%233AFFB8" alt="Website" /></a>
</p>
<p align="center">
  <a href="https://trendshift.io/repositories/19802?utm_source=repository-badge&amp;utm_medium=badge&amp;utm_campaign=badge-repository-19802" target="_blank" rel="noopener noreferrer"><img src="https://trendshift.io/api/badge/repositories/19802" alt="sameerasw%2Fessentials | Trendshift" width="250" height="55"/></a>
</p>

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

<img width="25%" alt="image" src="https://github.com/user-attachments/assets/d36c5a92-6d28-43c2-8431-92a7ffd7ac61" />

This is a new restriction on Android with sideloaded apps that can receive sensitive permissions such as Accessibility or Notification Listener, which Essentials both may utilize.

- You can still proceed avoiding this, but you will have to temporarily disable Google Play Protect during the installation.
- But then again, you may notice the toggle for Play Protect in the Play Store being enabled and grayed out, not allowing to be disabled. This is due to the "Advanced protection" feature in Pixels that entirely blocks sideloading. So you will have to disable "Advanced Protection" as well.
- Follow below steps to avoid it during the installation.

![Screenshot_20260304-184451 Large](https://github.com/user-attachments/assets/1402a374-3881-4afc-aff0-269517d0e28f)
![Screenshot_20260304-184409 Large](https://github.com/user-attachments/assets/b7bf634a-6ea4-4b22-8ccf-09593bf7bbed)

> ### IMPORTANT: Yes, this is very annoying, but I understand the need of such prevention to avoid users installing potentially harmful apps from unknown sources. Well I hope you trust me to install my app but anyways, you should always verify the trusted source before installing any APK file from the internet. ʅ(°_°)ʃ

# Shell Providers (Shizuku & Root)

- Essentials supports both **Shizuku** and **Root** as shell providers for executing advanced system-level commands.
- **Shizuku**: Make sure to get the latest version of Shizuku preferably from a fork such as [rushiranpise/Shizuku-Next](https://github.com/rushiranpise/Shizuku-Next) or other not from the Google Play as it is no longer well supported.
- **Root**: If your device is rooted, Essentials can bypass Shizuku and use root privileges directly for features like Button Remap and App Freezing.

# How to grant accessibility permissions

<img width="1280" height="696" alt="image" src="https://github.com/user-attachments/assets/685115e7-4caa-4add-9196-d2e1e2c126a6" />

# Localization

## How to translate?
https://github.com/user-attachments/assets/22ea02cd-1276-4088-8537-c41bd2c4a3fc

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
