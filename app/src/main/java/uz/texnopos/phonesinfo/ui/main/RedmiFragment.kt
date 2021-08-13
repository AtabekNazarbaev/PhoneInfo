package uz.texnopos.phonesinfo.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_apple.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import uz.texnopos.phonesinfo.Adapter
import uz.texnopos.phonesinfo.R
import uz.texnopos.phonesinfo.database.MyDao
import uz.texnopos.phonesinfo.database.MyDatabase

class RedmiFragment : Fragment(R.layout.fragment_redmi) {

    private lateinit var dao: MyDao
    private var mAdapter = Adapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dao = MyDatabase.getInstance(requireContext()).phonesDao()
        mAdapter.models = dao.getSortPhones(1)
        recyclerView.adapter = mAdapter
//        setData()
    }

//    private fun setData() {
        //        CoroutineScope(Dispatchers.Main).launch {
//            mAdapter.models = withContext(Dispatchers.IO) {
//                dao.getSortPhones(1)
//            }
//        }
//    }
}