package uz.texnopos.phonesinfo.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_scrolling.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import uz.texnopos.phonesinfo.Adapter
import uz.texnopos.phonesinfo.R
import uz.texnopos.phonesinfo.database.ChDao
import uz.texnopos.phonesinfo.database.Characteristics
import uz.texnopos.phonesinfo.database.MyDao
import uz.texnopos.phonesinfo.database.MyDatabase

class ScrollingFragment : Fragment(R.layout.fragment_scrolling) {

    private lateinit var dao: ChDao
    private lateinit var navController: NavController
    private val args: ScrollingFragmentArgs by navArgs()
    private var character:MutableList<Characteristics> = mutableListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        dao = MyDatabase.getInstance(requireContext()).chDaoo()
        character = dao.getCharachteristics(args.phoneId) as MutableList<Characteristics>

        back.setOnClickListener {
            requireActivity().onBackPressed()
        }

        tvTitle.text = args.phonename

    }
}