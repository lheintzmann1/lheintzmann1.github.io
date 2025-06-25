package org.lheintzmann1.website.util

import org.jetbrains.compose.web.css.CSSColorValue

object Res {
    enum class Theme(val color: CSSColorValue) {

    }

    object Icons {
        const val LH = "icons/lh.svg"
        const val LH_BG = "icons/lh-bg.svg"
        const val LH_WHITE = "icons/lh-white.svg"
        const val LH_WHITE_BG = "icons/lh-white-bg.svg"
    }

    object Images {
        const val PROFILE_PHOTO = "images/me.jpg"
    }

    object Strings {
        const val NAME = "Lucas HEINTZMANN"
        const val ABOUT_ME =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."

        const val EMAIL = "mailto:lheintzmann1@disroot.org"
        const val GITHUB = "https://github.com/lheintzmann1"
    }
}