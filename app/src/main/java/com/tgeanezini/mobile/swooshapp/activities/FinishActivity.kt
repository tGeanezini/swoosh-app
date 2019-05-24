package com.tgeanezini.mobile.swooshapp.activities

import android.os.Bundle
import com.tgeanezini.mobile.swooshapp.R
import com.tgeanezini.mobile.swooshapp.utils.EXTRA_LEAGUE
import com.tgeanezini.mobile.swooshapp.utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchingLeagueLabel.text = "Looking for a $league $skill league near you..."
    }
}
