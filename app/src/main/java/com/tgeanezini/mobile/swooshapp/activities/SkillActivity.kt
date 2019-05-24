package com.tgeanezini.mobile.swooshapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tgeanezini.mobile.swooshapp.R
import com.tgeanezini.mobile.swooshapp.models.Player
import com.tgeanezini.mobile.swooshapp.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    private lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClick(view: View) {
        ballerSkillButton.isChecked = false
        player.skill = "Beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillButton.isChecked = false
        player.skill = "Baller"
    }

    fun onFinishClick(view:View) {
        if (player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Select a skill level to continue", Toast.LENGTH_LONG).show()
        }
    }
}
