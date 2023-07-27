import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myproctor.R
import com.example.myproctor.databinding.FragmentAnomaliesBinding

class AnomaliesFragment : Fragment() {
    private var _binding: FragmentAnomaliesBinding? = null
    private val binding get() = _binding!!
    private var isScanning = false // Flag to track the button state

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnomaliesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set the initial state of the button to "Start Scan"
        binding.scanBtn.text = "Start Scan"

        binding.scanBtn.setOnClickListener {
            isScanning = !isScanning // Toggle the state on button click

            if (isScanning) {
                // TODO: Implement actions when "Start Scan" button is clicked
                binding.scanBtn.text = "Stop Scan"
                binding.scanBtn.setCompoundDrawablesWithIntrinsicBounds(
                    0,0,R.drawable.baseline_stop_24, 0,
                )
            } else {
                // TODO: Implement actions when "Stop Scan" button is clicked
                binding.scanBtn.text = "Start Scan"
                binding.scanBtn.setCompoundDrawablesWithIntrinsicBounds(
                    0,0,R.drawable.baseline_play_arrow_24, 0,
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Avoid memory leaks by nullifying the binding reference
    }
}
