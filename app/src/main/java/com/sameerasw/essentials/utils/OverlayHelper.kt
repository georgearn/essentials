/*
 * Copyright (c) 2026 sameerasw.com
 * License: MIT License
 *
 * Feature Module: Utilities - General
 * File: OverlayHelper.kt
 * Description: Utility helper for OverlayHelper.kt.
 */

package com.sameerasw.essentials.utils

import android.os.Build
import android.view.Gravity
import android.view.WindowManager

/**
 * Utility helper for creating full-screen overlay window parameters.
 */
object OverlayHelper {
    /**
     * Creates layout params for a full-screen overlay window.
     *
     * @param overlayType The window type of the overlay
     * @param flags Extra window flags
     * @param isTouchable Whether the overlay receives touch events
     * @return The configured [WindowManager.LayoutParams]
     */
    fun createOverlayLayoutParams(
        overlayType: Int,
        flags: Int = 0,
        isTouchable: Boolean = false,
    ): WindowManager.LayoutParams {
        var baseFlags =
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS or
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED or
                WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD

        if (!isTouchable) {
            baseFlags = baseFlags or WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        }

        val params =
            WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT,
                overlayType,
                baseFlags or flags,
                android.graphics.PixelFormat.TRANSLUCENT,
            )
        params.gravity = Gravity.TOP or Gravity.START

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            try {
                params.layoutInDisplayCutoutMode =
                    WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
            } catch (_: Exception) {
            }
        }

        return params
    }
}
