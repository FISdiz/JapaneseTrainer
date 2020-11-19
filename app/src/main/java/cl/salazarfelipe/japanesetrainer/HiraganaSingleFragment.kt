package cl.salazarfelipe.japanesetrainer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import cl.salazarfelipe.japanesetrainer.data.listHiraganaChar
import kotlinx.android.synthetic.main.fragment_hiragana_single.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HiraganaSingleFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hiragana_single, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HiraganaSingleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        action_refresh_button.setOnClickListener {
            refreshFragment()
        }

        hiragana_char.text = listHiraganaChar.random()

        hira_send.setOnClickListener {

/*            when {
                hiragana_char.text == "あ" && hira_answer.text.toString().toUpperCase() == "A" -> correctAnswer()
                hiragana_char.text == "い" && hira_answer.text.toString().toUpperCase() == "I" -> correctAnswer()

            }*/

            if (hiragana_char.text == "あ" && hira_answer.text.toString().toUpperCase() == "A") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "い" && hira_answer.text.toString().toUpperCase() == "I") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "う" && hira_answer.text.toString().toUpperCase() == "U") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "え" && hira_answer.text.toString().toUpperCase() == "E") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "お" && hira_answer.text.toString().toUpperCase() == "O") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "か" && hira_answer.text.toString().toUpperCase() == "KA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "き" && hira_answer.text.toString().toUpperCase() == "KI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "く" && hira_answer.text.toString().toUpperCase() == "KU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "け" && hira_answer.text.toString().toUpperCase() == "KE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "こ" && hira_answer.text.toString().toUpperCase() == "KO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "が" && hira_answer.text.toString().toUpperCase() == "GA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぎ" && hira_answer.text.toString().toUpperCase() == "GI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぐ" && hira_answer.text.toString().toUpperCase() == "GU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "げ" && hira_answer.text.toString().toUpperCase() == "GE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ご" && hira_answer.text.toString().toUpperCase() == "GO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "さ" && hira_answer.text.toString().toUpperCase() == "SA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "し" && hira_answer.text.toString().toUpperCase() == "SHI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "す" && hira_answer.text.toString().toUpperCase() == "SU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "せ" && hira_answer.text.toString().toUpperCase() == "SE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "そ" && hira_answer.text.toString().toUpperCase() == "SO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ざ" && hira_answer.text.toString().toUpperCase() == "ZA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "じ" && hira_answer.text.toString().toUpperCase() == "JI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ず" && hira_answer.text.toString().toUpperCase() == "ZU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぜ" && hira_answer.text.toString().toUpperCase() == "ZE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぞ" && hira_answer.text.toString().toUpperCase() == "ZO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "た" && hira_answer.text.toString().toUpperCase() == "TA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ち" && hira_answer.text.toString().toUpperCase() == "CHI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "つ" && hira_answer.text.toString().toUpperCase() == "TSU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "て" && hira_answer.text.toString().toUpperCase() == "TE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "と" && hira_answer.text.toString().toUpperCase() == "TO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "だ" && hira_answer.text.toString().toUpperCase() == "DA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぢ" && hira_answer.text.toString().toUpperCase() == "JI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "づ" && hira_answer.text.toString().toUpperCase() == "ZU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "で" && hira_answer.text.toString().toUpperCase() == "DE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ど" && hira_answer.text.toString().toUpperCase() == "DO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "な" && hira_answer.text.toString().toUpperCase() == "NA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "に" && hira_answer.text.toString().toUpperCase() == "NI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぬ" && hira_answer.text.toString().toUpperCase() == "NU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ね" && hira_answer.text.toString().toUpperCase() == "NE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "の" && hira_answer.text.toString().toUpperCase() == "NO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "は" && hira_answer.text.toString().toUpperCase() == "HA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ひ" && hira_answer.text.toString().toUpperCase() == "HI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ふ" && hira_answer.text.toString().toUpperCase() == "FU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "へ" && hira_answer.text.toString().toUpperCase() == "HE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ほ" && hira_answer.text.toString().toUpperCase() == "HO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ば" && hira_answer.text.toString().toUpperCase() == "BA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "び" && hira_answer.text.toString().toUpperCase() == "BI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぶ" && hira_answer.text.toString().toUpperCase() == "BU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "べ" && hira_answer.text.toString().toUpperCase() == "BE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぼ" && hira_answer.text.toString().toUpperCase() == "BO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぱ" && hira_answer.text.toString().toUpperCase() == "PA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぴ" && hira_answer.text.toString().toUpperCase() == "PI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぷ" && hira_answer.text.toString().toUpperCase() == "PU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぺ" && hira_answer.text.toString().toUpperCase() == "PE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぽ" && hira_answer.text.toString().toUpperCase() == "PO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ま" && hira_answer.text.toString().toUpperCase() == "MA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "み" && hira_answer.text.toString().toUpperCase() == "MI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "む" && hira_answer.text.toString().toUpperCase() == "MU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "め" && hira_answer.text.toString().toUpperCase() == "ME") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "も" && hira_answer.text.toString().toUpperCase() == "MO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "や" && hira_answer.text.toString().toUpperCase() == "YA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ゆ" && hira_answer.text.toString().toUpperCase() == "YU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "よ" && hira_answer.text.toString().toUpperCase() == "YO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ら" && hira_answer.text.toString().toUpperCase() == "RA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "り" && hira_answer.text.toString().toUpperCase() == "RI") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "る" && hira_answer.text.toString().toUpperCase() == "RU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "れ" && hira_answer.text.toString().toUpperCase() == "RE") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ろ" && hira_answer.text.toString().toUpperCase() == "RO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "わ" && hira_answer.text.toString().toUpperCase() == "WA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "を" && hira_answer.text.toString().toUpperCase() == "WO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ん" && hira_answer.text.toString().toUpperCase() == "N") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "きゃ" && hira_answer.text.toString().toUpperCase() == "KYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "きゅ" && hira_answer.text.toString().toUpperCase() == "KYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "きょ" && hira_answer.text.toString().toUpperCase() == "KYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぎゃ" && hira_answer.text.toString().toUpperCase() == "GYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぎゅ" && hira_answer.text.toString().toUpperCase() == "GYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぎょ" && hira_answer.text.toString().toUpperCase() == "GYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "しゃ" && hira_answer.text.toString().toUpperCase() == "SHA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "しゅ" && hira_answer.text.toString().toUpperCase() == "SHU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "しょ" && hira_answer.text.toString().toUpperCase() == "SHO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "じゃ" && hira_answer.text.toString().toUpperCase() == "JA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "じゅ" && hira_answer.text.toString().toUpperCase() == "JU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "じょ" && hira_answer.text.toString().toUpperCase() == "JO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ちゃ" && hira_answer.text.toString().toUpperCase() == "CHA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ちゅ" && hira_answer.text.toString().toUpperCase() == "CHU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ちょ" && hira_answer.text.toString().toUpperCase() == "CHO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぢゃ" && hira_answer.text.toString().toUpperCase() == "DJA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぢゅ" && hira_answer.text.toString().toUpperCase() == "DJU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぢょ" && hira_answer.text.toString().toUpperCase() == "DJO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "にゃ" && hira_answer.text.toString().toUpperCase() == "NYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "にゅ" && hira_answer.text.toString().toUpperCase() == "NYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "にょ" && hira_answer.text.toString().toUpperCase() == "NYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ひゃ" && hira_answer.text.toString().toUpperCase() == "HYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ひゅ" && hira_answer.text.toString().toUpperCase() == "HYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ひょ" && hira_answer.text.toString().toUpperCase() == "HYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "びゃ" && hira_answer.text.toString().toUpperCase() == "BYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "びゅ" && hira_answer.text.toString().toUpperCase() == "BYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "びょ" && hira_answer.text.toString().toUpperCase() == "BYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぴゃ" && hira_answer.text.toString().toUpperCase() == "PYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぴゅ" && hira_answer.text.toString().toUpperCase() == "PYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "ぴょ" && hira_answer.text.toString().toUpperCase() == "PYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "みゃ" && hira_answer.text.toString().toUpperCase() == "MYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "みゅ" && hira_answer.text.toString().toUpperCase() == "MYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "みょ" && hira_answer.text.toString().toUpperCase() == "MYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "りゃ" && hira_answer.text.toString().toUpperCase() == "RYA") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "りゅ" && hira_answer.text.toString().toUpperCase() == "RYU") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            if (hiragana_char.text == "りょ" && hira_answer.text.toString().toUpperCase() == "RYO") {
                Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
                refreshFragment()
            }
            else {
            }

        }
    }

    fun refreshFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, newInstance("",""),"hiraganaTest")
            .commit()
    }

    fun correctAnswer() {
        Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
        refreshFragment()
    }
}