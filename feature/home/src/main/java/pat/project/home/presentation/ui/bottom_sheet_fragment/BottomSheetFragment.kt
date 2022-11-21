package pat.project.home.presentation.ui.bottom_sheet_fragment

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import pat.project.ecompatproject.feature.home.R
import pat.project.ecompatproject.feature.home.databinding.FragmentBottomSheetDialogFragmentBinding

class BottomSheetFragment : BottomSheetDialogFragment(R.layout.fragment_bottom_sheet_dialog_fragment){
    private val viewBinding  by viewBinding(FragmentBottomSheetDialogFragmentBinding::bind)

    override fun getTheme() = R.style.AppBottomSheetDialogTheme

    val brandList = listOf("Samsung", "Apple", "Xiaomi")
    val priceList = listOf("\$300 - \$500", "\$500 - \$800", "\$800 - \$1000")
    val sizeList = listOf("4.5 to 5.5 inches", "5.5 to 6.5 inches", "0 to 100 inches")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(viewBinding.brandSpinner)
        {
            adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, brandList)
            setSelection(0, false)
            prompt = "Select brand"

        }
        with(viewBinding.priceSpinner)
        {
            adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, priceList)
            setSelection(0, false)
            prompt = "Select price"

        }
        with(viewBinding.sizeSpinner)
        {
            adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, sizeList)
            setSelection(0, false)
            prompt = "Select size"

        }

        super.onViewCreated(view, savedInstanceState)
    }
}