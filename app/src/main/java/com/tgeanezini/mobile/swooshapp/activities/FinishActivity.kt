package com.tgeanezini.mobile.swooshapp.activities

import android.os.Bundle
import com.tgeanezini.mobile.swooshapp.R
import com.tgeanezini.mobile.swooshapp.models.Player
import com.tgeanezini.mobile.swooshapp.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchingLeagueLabel.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
