package cl.salazarfelipe.japanesetrainer.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import cl.salazarfelipe.japanesetrainer.R
import cl.salazarfelipe.japanesetrainer.data.listKatakanaChar
import kotlinx.android.synthetic.main.fragment_hiragana_single.*
import kotlinx.android.synthetic.main.fragment_hiragana_single.action_refresh_button
import kotlinx.android.synthetic.main.fragment_katakana_single.*
import kotlinx.android.synthetic.main.fragment_katakana_single.correct_count_txt

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class KatakanaSingleFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    var correctas = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_katakana_single, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                KatakanaSingleFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        action_refresh_button.setOnClickListener {
            refreshChar()
        }

        katakana_char.text = listKatakanaChar.random()

        kata_send_button.setOnClickListener {

            when {
                (katakana_char.text == "ア" && kata_answer.text.toString().toUpperCase() == "A") ||
                        (katakana_char.text == "イ" && kata_answer.text.toString().toUpperCase() == "I") ||
                        (katakana_char.text == "ウ" && kata_answer.text.toString().toUpperCase() == "U") ||
                        (katakana_char.text == "エ" && kata_answer.text.toString().toUpperCase() == "E") ||
                        (katakana_char.text == "オ" && kata_answer.text.toString().toUpperCase() == "O") ||
                        (katakana_char.text == "カ" && kata_answer.text.toString().toUpperCase() == "KA") ||
                        (katakana_char.text == "キ" && kata_answer.text.toString().toUpperCase() == "KI") ||
                        (katakana_char.text == "ク" && kata_answer.text.toString().toUpperCase() == "KU") ||
                        (katakana_char.text == "ケ" && kata_answer.text.toString().toUpperCase() == "KE") ||
                        (katakana_char.text == "コ" && kata_answer.text.toString().toUpperCase() == "KO") ||
                        (katakana_char.text == "ガ" && kata_answer.text.toString().toUpperCase() == "GA") ||
                        (katakana_char.text == "ギ" && kata_answer.text.toString().toUpperCase() == "GI") ||
                        (katakana_char.text == "グ" && kata_answer.text.toString().toUpperCase() == "GU") ||
                        (katakana_char.text == "ゲ" && kata_answer.text.toString().toUpperCase() == "GE") ||
                        (katakana_char.text == "ゴ" && kata_answer.text.toString().toUpperCase() == "GO") ||
                        (katakana_char.text == "サ" && kata_answer.text.toString().toUpperCase() == "SA") ||
                        (katakana_char.text == "シ" && kata_answer.text.toString().toUpperCase() == "SHI") ||
                        (katakana_char.text == "ス" && kata_answer.text.toString().toUpperCase() == "SU") ||
                        (katakana_char.text == "セ" && kata_answer.text.toString().toUpperCase() == "SE") ||
                        (katakana_char.text == "ソ" && kata_answer.text.toString().toUpperCase() == "SO") ||
                        (katakana_char.text == "ザ" && kata_answer.text.toString().toUpperCase() == "ZA") ||
                        (katakana_char.text == "ジ" && kata_answer.text.toString().toUpperCase() == "JI") ||
                        (katakana_char.text == "ズ" && kata_answer.text.toString().toUpperCase() == "ZU") ||
                        (katakana_char.text == "ゼ" && kata_answer.text.toString().toUpperCase() == "ZE") ||
                        (katakana_char.text == "ゾ" && kata_answer.text.toString().toUpperCase() == "ZO") ||
                        (katakana_char.text == "タ" && kata_answer.text.toString().toUpperCase() == "TA") ||
                        (katakana_char.text == "チ" && kata_answer.text.toString().toUpperCase() == "CHI") ||
                        (katakana_char.text == "ツ" && kata_answer.text.toString().toUpperCase() == "TSU") ||
                        (katakana_char.text == "テ" && kata_answer.text.toString().toUpperCase() == "TE") ||
                        (katakana_char.text == "ト" && kata_answer.text.toString().toUpperCase() == "TO") ||
                        (katakana_char.text == "ダ" && kata_answer.text.toString().toUpperCase() == "DA") ||
                        (katakana_char.text == "ヂ" && kata_answer.text.toString().toUpperCase() == "JI") ||
                        (katakana_char.text == "ヅ" && kata_answer.text.toString().toUpperCase() == "ZU") ||
                        (katakana_char.text == "デ" && kata_answer.text.toString().toUpperCase() == "DE") ||
                        (katakana_char.text == "ド" && kata_answer.text.toString().toUpperCase() == "DO") ||
                        (katakana_char.text == "ナ" && kata_answer.text.toString().toUpperCase() == "NA") ||
                        (katakana_char.text == "ニ" && kata_answer.text.toString().toUpperCase() == "NI") ||
                        (katakana_char.text == "ヌ" && kata_answer.text.toString().toUpperCase() == "NU") ||
                        (katakana_char.text == "ネ" && kata_answer.text.toString().toUpperCase() == "NE") ||
                        (katakana_char.text == "ノ" && kata_answer.text.toString().toUpperCase() == "NO") ||
                        (katakana_char.text == "ハ" && kata_answer.text.toString().toUpperCase() == "HA") ||
                        (katakana_char.text == "ヒ" && kata_answer.text.toString().toUpperCase() == "HI") ||
                        (katakana_char.text == "フ" && kata_answer.text.toString().toUpperCase() == "FU") ||
                        (katakana_char.text == "ヘ" && kata_answer.text.toString().toUpperCase() == "HE") ||
                        (katakana_char.text == "ホ" && kata_answer.text.toString().toUpperCase() == "HO") ||
                        (katakana_char.text == "バ" && kata_answer.text.toString().toUpperCase() == "BA") ||
                        (katakana_char.text == "ビ" && kata_answer.text.toString().toUpperCase() == "BI") ||
                        (katakana_char.text == "ブ" && kata_answer.text.toString().toUpperCase() == "BU") ||
                        (katakana_char.text == "ベ" && kata_answer.text.toString().toUpperCase() == "BE") ||
                        (katakana_char.text == "ボ" && kata_answer.text.toString().toUpperCase() == "BO") ||
                        (katakana_char.text == "パ" && kata_answer.text.toString().toUpperCase() == "PA") ||
                        (katakana_char.text == "ピ" && kata_answer.text.toString().toUpperCase() == "PI") ||
                        (katakana_char.text == "プ" && kata_answer.text.toString().toUpperCase() == "PU") ||
                        (katakana_char.text == "ペ" && kata_answer.text.toString().toUpperCase() == "PE") ||
                        (katakana_char.text == "ポ" && kata_answer.text.toString().toUpperCase() == "PO") ||
                        (katakana_char.text == "マ" && kata_answer.text.toString().toUpperCase() == "MA") ||
                        (katakana_char.text == "ミ" && kata_answer.text.toString().toUpperCase() == "MI") ||
                        (katakana_char.text == "ム" && kata_answer.text.toString().toUpperCase() == "MU") ||
                        (katakana_char.text == "メ" && kata_answer.text.toString().toUpperCase() == "ME") ||
                        (katakana_char.text == "モ" && kata_answer.text.toString().toUpperCase() == "MO") ||
                        (katakana_char.text == "ヤ" && kata_answer.text.toString().toUpperCase() == "YA") ||
                        (katakana_char.text == "ユ" && kata_answer.text.toString().toUpperCase() == "YU") ||
                        (katakana_char.text == "ヨ" && kata_answer.text.toString().toUpperCase() == "YO") ||
                        (katakana_char.text == "ラ" && kata_answer.text.toString().toUpperCase() == "RA") ||
                        (katakana_char.text == "リ" && kata_answer.text.toString().toUpperCase() == "RI") ||
                        (katakana_char.text == "ル" && kata_answer.text.toString().toUpperCase() == "RU") ||
                        (katakana_char.text == "レ" && kata_answer.text.toString().toUpperCase() == "RE") ||
                        (katakana_char.text == "ロ" && kata_answer.text.toString().toUpperCase() == "RO") ||
                        (katakana_char.text == "ワ" && kata_answer.text.toString().toUpperCase() == "WA") ||
                        (katakana_char.text == "ヲ" && kata_answer.text.toString().toUpperCase() == "WO") ||
                        (katakana_char.text == "ン" && kata_answer.text.toString().toUpperCase() == "N") ||
                        (katakana_char.text == "ャ" && kata_answer.text.toString().toUpperCase() == "YA") ||
                        (katakana_char.text == "ュ" && kata_answer.text.toString().toUpperCase() == "YU") ||
                        (katakana_char.text == "ョ" && kata_answer.text.toString().toUpperCase() == "YO") ||
                        (katakana_char.text == "キャ" && kata_answer.text.toString().toUpperCase() == "KYA") ||
                        (katakana_char.text == "キュ" && kata_answer.text.toString().toUpperCase() == "KYU") ||
                        (katakana_char.text == "キョ" && kata_answer.text.toString().toUpperCase() == "KYO") ||
                        (katakana_char.text == "ギャ" && kata_answer.text.toString().toUpperCase() == "GYA") ||
                        (katakana_char.text == "ギュ" && kata_answer.text.toString().toUpperCase() == "GYU") ||
                        (katakana_char.text == "ギョ" && kata_answer.text.toString().toUpperCase() == "GYO") ||
                        (katakana_char.text == "シャ" && kata_answer.text.toString().toUpperCase() == "SHA") ||
                        (katakana_char.text == "シュ" && kata_answer.text.toString().toUpperCase() == "SHU") ||
                        (katakana_char.text == "ショ" && kata_answer.text.toString().toUpperCase() == "SHO") ||
                        (katakana_char.text == "ジャ" && kata_answer.text.toString().toUpperCase() == "JA") ||
                        (katakana_char.text == "ジュ" && kata_answer.text.toString().toUpperCase() == "JU") ||
                        (katakana_char.text == "ジョ" && kata_answer.text.toString().toUpperCase() == "JO") ||
                        (katakana_char.text == "チャ" && kata_answer.text.toString().toUpperCase() == "CHA") ||
                        (katakana_char.text == "チュ" && kata_answer.text.toString().toUpperCase() == "CHU") ||
                        (katakana_char.text == "チョ" && kata_answer.text.toString().toUpperCase() == "CHO") ||
                        (katakana_char.text == "ヂャ" && kata_answer.text.toString().toUpperCase() == "DJA") ||
                        (katakana_char.text == "ヂュ" && kata_answer.text.toString().toUpperCase() == "DJU") ||
                        (katakana_char.text == "ヂョ" && kata_answer.text.toString().toUpperCase() == "DJO") ||
                        (katakana_char.text == "ニャ" && kata_answer.text.toString().toUpperCase() == "NYA") ||
                        (katakana_char.text == "ニュ" && kata_answer.text.toString().toUpperCase() == "NYU") ||
                        (katakana_char.text == "ニョ" && kata_answer.text.toString().toUpperCase() == "NYO") ||
                        (katakana_char.text == "ヒャ" && kata_answer.text.toString().toUpperCase() == "HYA") ||
                        (katakana_char.text == "ヒュ" && kata_answer.text.toString().toUpperCase() == "HYU") ||
                        (katakana_char.text == "ヒョ" && kata_answer.text.toString().toUpperCase() == "HYO") ||
                        (katakana_char.text == "ビャ" && kata_answer.text.toString().toUpperCase() == "BYA") ||
                        (katakana_char.text == "ビュ" && kata_answer.text.toString().toUpperCase() == "BYU") ||
                        (katakana_char.text == "ビョ" && kata_answer.text.toString().toUpperCase() == "BYO") ||
                        (katakana_char.text == "ピャ" && kata_answer.text.toString().toUpperCase() == "PYA") ||
                        (katakana_char.text == "ピュ" && kata_answer.text.toString().toUpperCase() == "PYU") ||
                        (katakana_char.text == "ピョ" && kata_answer.text.toString().toUpperCase() == "PYO") ||
                        (katakana_char.text == "ミャ" && kata_answer.text.toString().toUpperCase() == "MYA") ||
                        (katakana_char.text == "ミュ" && kata_answer.text.toString().toUpperCase() == "MYU") ||
                        (katakana_char.text == "ミョ" && kata_answer.text.toString().toUpperCase() == "MYO") ||
                        (katakana_char.text == "リャ" && kata_answer.text.toString().toUpperCase() == "RYA") ||
                        (katakana_char.text == "リュ" && kata_answer.text.toString().toUpperCase() == "RYU") ||
                        (katakana_char.text == "リョ" && kata_answer.text.toString().toUpperCase() == "RYO") -> correctAnswer()
                else -> incorrectAnswer()
            }
        }
    }

    fun refreshChar() {
        katakana_char.text = listKatakanaChar.random()
    }

    fun correctAnswer() {
        Toast.makeText(context, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show()
        correct_count_txt.text = "$correctas"
        correctas++
        refreshChar()
    }

    fun incorrectAnswer() {
        Toast.makeText(context, "RESPUESTA INCORRECTA", Toast.LENGTH_SHORT).show()
    }
}