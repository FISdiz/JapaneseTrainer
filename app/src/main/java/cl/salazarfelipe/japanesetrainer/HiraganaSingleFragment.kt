package cl.salazarfelipe.japanesetrainer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_hiragana_single.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HiraganaSingleFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    var listHiraganaChar = mutableListOf(
        // vocales
        "あ", "い", "う", "え", "お",
        // K - G
        "か", "き", "く", "け", "こ",
        "が", "ぎ", "ぐ", "げ", "ご",
        // S - Z
        "さ","し","す","せ","そ",
        "ざ","じ","ず","ぜ","ぞ",
        // T - D
        "た","ち","つ","て","と",
        "だ","ぢ","づ","で","ど",
        // N
        "な","に","ぬ","ね","の",
        // H - B - P
        "は","ひ","ふ","へ","ほ",
        "ば","び","ぶ","べ","ぼ",
        "ぱ","ぴ","ぷ","ぺ","ぽ",
        // M
        "ま","み","む","め","も",
        // YA - YU - YO
        "や","ゆ","よ",
        // R
        "ら","り","る","れ","ろ",
        // WA - WO - N
        "わ","を","ん",
        // KY - GY (A-U-O)
        "きゃ","きゅ","きょ",
        "ぎゃ","ぎゅ","ぎょ",
        // SH - J
        "しゃ","しゅ","しょ",
        "じゃ","じゅ","じょ",
        // CH - DJ
        "ちゃ","ちゅ","ちょ",
        "ぢゃ","ぢゅ","ぢょ",
        // NY
        "にゃ","にゅ","にょ",
        // HY - BY - PY
        "ひゃ","ひゅ","ひょ",
        "びゃ","びゅ","びょ",
        "ぴゃ","ぴゅ","ぴょ",
        // MY
        "みゃ","みゅ","みょ",
        // RY
        "りゃ","りゅ","りょ"
    )

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
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, newInstance("",""),"hiraganaTest")
                .commit()
        }

        hiragana_char.text = listHiraganaChar.random()

    }
}