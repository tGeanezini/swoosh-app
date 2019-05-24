package com.tgeanezini.mobile.swooshapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tgeanezini.mobile.swooshapp.utils.EXTRA_LEAGUE
import com.tgeanezini.mobile.swooshapp.R
import com.tgeanezini.mobile.swooshapp.utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    private var league = ""
    private var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClick(view: View) {
        ballerSkillButton.isChecked = false
        skill = "Beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillButton.isChecked = false
        skill = "Baller"
    }

    fun onFinishClick(view:View) {
        if (skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Select a skill level to continue", Toast.LENGTH_LONG).show()
        }
    }
}
