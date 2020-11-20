package cl.salazarfelipe.japanesetrainer.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import cl.salazarfelipe.japanesetrainer.R
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

            when {
                (hiragana_char.text == "あ" && hira_answer.text.toString().toUpperCase() == "A") ||
                        (hiragana_char.text == "い" && hira_answer.text.toString().toUpperCase() == "I") ||
                        (hiragana_char.text == "う" && hira_answer.text.toString().toUpperCase() == "U") ||
                        (hiragana_char.text == "え" && hira_answer.text.toString().toUpperCase() == "E") ||
                        (hiragana_char.text == "お" && hira_answer.text.toString().toUpperCase() == "O") ||
                        (hiragana_char.text == "か" && hira_answer.text.toString().toUpperCase() == "KA") ||
                        (hiragana_char.text == "き" && hira_answer.text.toString().toUpperCase() == "KI") ||
                        (hiragana_char.text == "く" && hira_answer.text.toString().toUpperCase() == "KU") ||
                        (hiragana_char.text == "け" && hira_answer.text.toString().toUpperCase() == "KE") ||
                        (hiragana_char.text == "こ" && hira_answer.text.toString().toUpperCase() == "KO") ||
                        (hiragana_char.text == "が" && hira_answer.text.toString().toUpperCase() == "GA") ||
                        (hiragana_char.text == "ぎ" && hira_answer.text.toString().toUpperCase() == "GI") ||
                        (hiragana_char.text == "ぐ" && hira_answer.text.toString().toUpperCase() == "GU") ||
                        (hiragana_char.text == "げ" && hira_answer.text.toString().toUpperCase() == "GE") ||
                        (hiragana_char.text == "ご" && hira_answer.text.toString().toUpperCase() == "GO") ||
                        (hiragana_char.text == "さ" && hira_answer.text.toString().toUpperCase() == "SA") ||
                        (hiragana_char.text == "し" && hira_answer.text.toString().toUpperCase() == "SHI") ||
                        (hiragana_char.text == "す" && hira_answer.text.toString().toUpperCase() == "SU") ||
                        (hiragana_char.text == "せ" && hira_answer.text.toString().toUpperCase() == "SE") ||
                        (hiragana_char.text == "そ" && hira_answer.text.toString().toUpperCase() == "SO") ||
                        (hiragana_char.text == "ざ" && hira_answer.text.toString().toUpperCase() == "ZA") ||
                        (hiragana_char.text == "じ" && hira_answer.text.toString().toUpperCase() == "JI") ||
                        (hiragana_char.text == "ず" && hira_answer.text.toString().toUpperCase() == "ZU") ||
                        (hiragana_char.text == "ぜ" && hira_answer.text.toString().toUpperCase() == "ZE") ||
                        (hiragana_char.text == "ぞ" && hira_answer.text.toString().toUpperCase() == "ZO") ||
                        (hiragana_char.text == "た" && hira_answer.text.toString().toUpperCase() == "TA") ||
                        (hiragana_char.text == "ち" && hira_answer.text.toString().toUpperCase() == "CHI") ||
                        (hiragana_char.text == "つ" && hira_answer.text.toString().toUpperCase() == "TSU") ||
                        (hiragana_char.text == "て" && hira_answer.text.toString().toUpperCase() == "TE") ||
                        (hiragana_char.text == "と" && hira_answer.text.toString().toUpperCase() == "TO") ||
                        (hiragana_char.text == "だ" && hira_answer.text.toString().toUpperCase() == "DA") ||
                        (hiragana_char.text == "ぢ" && hira_answer.text.toString().toUpperCase() == "JI") ||
                        (hiragana_char.text == "づ" && hira_answer.text.toString().toUpperCase() == "ZU") ||
                        (hiragana_char.text == "で" && hira_answer.text.toString().toUpperCase() == "DE") ||
                        (hiragana_char.text == "ど" && hira_answer.text.toString().toUpperCase() == "DO") ||
                        (hiragana_char.text == "な" && hira_answer.text.toString().toUpperCase() == "NA") ||
                        (hiragana_char.text == "に" && hira_answer.text.toString().toUpperCase() == "NI") ||
                        (hiragana_char.text == "ぬ" && hira_answer.text.toString().toUpperCase() == "NU") ||
                        (hiragana_char.text == "ね" && hira_answer.text.toString().toUpperCase() == "NE") ||
                        (hiragana_char.text == "の" && hira_answer.text.toString().toUpperCase() == "NO") ||
                        (hiragana_char.text == "は" && hira_answer.text.toString().toUpperCase() == "HA") ||
                        (hiragana_char.text == "ひ" && hira_answer.text.toString().toUpperCase() == "HI") ||
                        (hiragana_char.text == "ふ" && hira_answer.text.toString().toUpperCase() == "FU") ||
                        (hiragana_char.text == "へ" && hira_answer.text.toString().toUpperCase() == "HE") ||
                        (hiragana_char.text == "ほ" && hira_answer.text.toString().toUpperCase() == "HO") ||
                        (hiragana_char.text == "ば" && hira_answer.text.toString().toUpperCase() == "BA") ||
                        (hiragana_char.text == "び" && hira_answer.text.toString().toUpperCase() == "BI") ||
                        (hiragana_char.text == "ぶ" && hira_answer.text.toString().toUpperCase() == "BU") ||
                        (hiragana_char.text == "べ" && hira_answer.text.toString().toUpperCase() == "BE") ||
                        (hiragana_char.text == "ぼ" && hira_answer.text.toString().toUpperCase() == "BO") ||
                        (hiragana_char.text == "ぱ" && hira_answer.text.toString().toUpperCase() == "PA") ||
                        (hiragana_char.text == "ぴ" && hira_answer.text.toString().toUpperCase() == "PI") ||
                        (hiragana_char.text == "ぷ" && hira_answer.text.toString().toUpperCase() == "PU") ||
                        (hiragana_char.text == "ぺ" && hira_answer.text.toString().toUpperCase() == "PE") ||
                        (hiragana_char.text == "ぽ" && hira_answer.text.toString().toUpperCase() == "PO") ||
                        (hiragana_char.text == "ま" && hira_answer.text.toString().toUpperCase() == "MA") ||
                        (hiragana_char.text == "み" && hira_answer.text.toString().toUpperCase() == "MI") ||
                        (hiragana_char.text == "む" && hira_answer.text.toString().toUpperCase() == "MU") ||
                        (hiragana_char.text == "め" && hira_answer.text.toString().toUpperCase() == "ME") ||
                        (hiragana_char.text == "も" && hira_answer.text.toString().toUpperCase() == "MO") ||
                        (hiragana_char.text == "や" && hira_answer.text.toString().toUpperCase() == "YA") ||
                        (hiragana_char.text == "ゆ" && hira_answer.text.toString().toUpperCase() == "YU") ||
                        (hiragana_char.text == "よ" && hira_answer.text.toString().toUpperCase() == "YO") ||
                        (hiragana_char.text == "ら" && hira_answer.text.toString().toUpperCase() == "RA") ||
                        (hiragana_char.text == "り" && hira_answer.text.toString().toUpperCase() == "RI") ||
                        (hiragana_char.text == "る" && hira_answer.text.toString().toUpperCase() == "RU") ||
                        (hiragana_char.text == "れ" && hira_answer.text.toString().toUpperCase() == "RE") ||
                        (hiragana_char.text == "ろ" && hira_answer.text.toString().toUpperCase() == "RO") ||
                        (hiragana_char.text == "わ" && hira_answer.text.toString().toUpperCase() == "WA") ||
                        (hiragana_char.text == "を" && hira_answer.text.toString().toUpperCase() == "WO") ||
                        (hiragana_char.text == "ん" && hira_answer.text.toString().toUpperCase() == "N") ||
                        (hiragana_char.text == "ゃ" && hira_answer.text.toString().toUpperCase() == "YA") ||
                        (hiragana_char.text == "ゅ" && hira_answer.text.toString().toUpperCase() == "YU") ||
                        (hiragana_char.text == "ょ" && hira_answer.text.toString().toUpperCase() == "YO") ||
                        (hiragana_char.text == "きゃ" && hira_answer.text.toString().toUpperCase() == "KYA") ||
                        (hiragana_char.text == "きゅ" && hira_answer.text.toString().toUpperCase() == "KYU") ||
                        (hiragana_char.text == "きょ" && hira_answer.text.toString().toUpperCase() == "KYO") ||
                        (hiragana_char.text == "ぎゃ" && hira_answer.text.toString().toUpperCase() == "GYA") ||
                        (hiragana_char.text == "ぎゅ" && hira_answer.text.toString().toUpperCase() == "GYU") ||
                        (hiragana_char.text == "ぎょ" && hira_answer.text.toString().toUpperCase() == "GYO") ||
                        (hiragana_char.text == "しゃ" && hira_answer.text.toString().toUpperCase() == "SHA") ||
                        (hiragana_char.text == "しゅ" && hira_answer.text.toString().toUpperCase() == "SHU") ||
                        (hiragana_char.text == "しょ" && hira_answer.text.toString().toUpperCase() == "SHO") ||
                        (hiragana_char.text == "じゃ" && hira_answer.text.toString().toUpperCase() == "JA") ||
                        (hiragana_char.text == "じゅ" && hira_answer.text.toString().toUpperCase() == "JU") ||
                        (hiragana_char.text == "じょ" && hira_answer.text.toString().toUpperCase() == "JO") ||
                        (hiragana_char.text == "ちゃ" && hira_answer.text.toString().toUpperCase() == "CHA") ||
                        (hiragana_char.text == "ちゅ" && hira_answer.text.toString().toUpperCase() == "CHU") ||
                        (hiragana_char.text == "ちょ" && hira_answer.text.toString().toUpperCase() == "CHO") ||
                        (hiragana_char.text == "ぢゃ" && hira_answer.text.toString().toUpperCase() == "DJA") ||
                        (hiragana_char.text == "ぢゅ" && hira_answer.text.toString().toUpperCase() == "DJU") ||
                        (hiragana_char.text == "ぢょ" && hira_answer.text.toString().toUpperCase() == "DJO") ||
                        (hiragana_char.text == "にゃ" && hira_answer.text.toString().toUpperCase() == "NYA") ||
                        (hiragana_char.text == "にゅ" && hira_answer.text.toString().toUpperCase() == "NYU") ||
                        (hiragana_char.text == "にょ" && hira_answer.text.toString().toUpperCase() == "NYO") ||
                        (hiragana_char.text == "ひゃ" && hira_answer.text.toString().toUpperCase() == "HYA") ||
                        (hiragana_char.text == "ひゅ" && hira_answer.text.toString().toUpperCase() == "HYU") ||
                        (hiragana_char.text == "ひょ" && hira_answer.text.toString().toUpperCase() == "HYO") ||
                        (hiragana_char.text == "びゃ" && hira_answer.text.toString().toUpperCase() == "BYA") ||
                        (hiragana_char.text == "びゅ" && hira_answer.text.toString().toUpperCase() == "BYU") ||
                        (hiragana_char.text == "びょ" && hira_answer.text.toString().toUpperCase() == "BYO") ||
                        (hiragana_char.text == "ぴゃ" && hira_answer.text.toString().toUpperCase() == "PYA") ||
                        (hiragana_char.text == "ぴゅ" && hira_answer.text.toString().toUpperCase() == "PYU") ||
                        (hiragana_char.text == "ぴょ" && hira_answer.text.toString().toUpperCase() == "PYO") ||
                        (hiragana_char.text == "みゃ" && hira_answer.text.toString().toUpperCase() == "MYA") ||
                        (hiragana_char.text == "みゅ" && hira_answer.text.toString().toUpperCase() == "MYU") ||
                        (hiragana_char.text == "みょ" && hira_answer.text.toString().toUpperCase() == "MYO") ||
                        (hiragana_char.text == "りゃ" && hira_answer.text.toString().toUpperCase() == "RYA") ||
                        (hiragana_char.text == "りゅ" && hira_answer.text.toString().toUpperCase() == "RYU") ||
                        (hiragana_char.text == "りょ" && hira_answer.text.toString().toUpperCase() == "RYO") -> correctAnswer()
                else -> incorrectAnswer()
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

    fun incorrectAnswer() {
        Toast.makeText(context, "RESPUESTA INCORRECTA", Toast.LENGTH_SHORT).show()
    }
}