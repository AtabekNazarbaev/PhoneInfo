package uz.texnopos.phonesinfo.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_apple.*
import kotlinx.coroutines.*
import uz.texnopos.phonesinfo.Adapter
import uz.texnopos.phonesinfo.R
import uz.texnopos.phonesinfo.database.MyDao
import uz.texnopos.phonesinfo.database.MyDatabase
import android.view.View as View

class AppleFragment : Fragment(R.layout.fragment_apple) {

    private lateinit var dao: MyDao
    private var mAdapter = Adapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dao = MyDatabase.getInstance(requireContext()).phonesDao()
        mAdapter.models = dao.getSortPhones(3)
        recyclerView.adapter = mAdapter
//        setData()
    }

//    private fun setData() {
//        CoroutineScope(Dispatchers.Main).launch {
//            mAdapter.models = withContext(Dispatchers.IO) {
//                dao.getSortPhones(3)
//            }
//        }
//    }
}