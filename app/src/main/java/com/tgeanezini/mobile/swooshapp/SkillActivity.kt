package com.tgeanezini.mobile.swooshapp

import android.os.Bundle

class SkillActivity : BaseActivity() {

    private var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
