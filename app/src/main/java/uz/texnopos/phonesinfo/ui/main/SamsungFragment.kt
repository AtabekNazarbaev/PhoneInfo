package uz.texnopos.phonesinfo.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.fragment_apple.*
import uz.texnopos.phonesinfo.Adapter
import uz.texnopos.phonesinfo.R
import uz.texnopos.phonesinfo.database.MyDao
import uz.texnopos.phonesinfo.database.MyDatabase

class SamsungFragment : Fragment(R.layout.fragment_samsung) {

    private var mAdapter = Adapter()
    private lateinit var dao: MyDao

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dao = MyDatabase.getInstance(requireContext()).phonesDao()
        mAdapter.models = dao.getSortPhones(2)
        recyclerView.adapter = mAdapter
//        setData()
    }
//
//    private fun setData() {
//        CoroutineScope(Dispatchers.Main).launch {
//            mAdapter.models = withContext(Dispatchers.IO) {
//                dao.getSortPhones(2)
//            }
//        }
//    }
}
