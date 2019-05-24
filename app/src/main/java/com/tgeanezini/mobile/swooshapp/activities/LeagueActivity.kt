package com.tgeanezini.mobile.swooshapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tgeanezini.mobile.swooshapp.R
import com.tgeanezini.mobile.swooshapp.models.Player
import com.tgeanezini.mobile.swooshapp.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    // Métodos responsáveis por manter o estado da tela no caso de mudanças de instância (Ex.: rotacionar a tela)
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(view: View) {
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        player.league = "womens"
    }

    fun onCoEdClicked(view: View) {
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Select a league to continue", Toast.LENGTH_LONG).show()
        }
    }
}
