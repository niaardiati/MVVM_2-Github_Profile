package id.ac.polbeng.githubprofile.helpers

import id.ac.polbeng.githubprofile.BuildConfig


class Config {
    companion object{
        const val SPLASH_SCREEN_DELAY:Long = 3000
        const val BASE_URL = "https://api.github.com"
        const val DEFAULT_USER_LOGIN = "niaardiati"
        const val PERSONAL_ACCESS_TOKEN = "token ${BuildConfig.ACCESS_TOKEN}"
    }
}