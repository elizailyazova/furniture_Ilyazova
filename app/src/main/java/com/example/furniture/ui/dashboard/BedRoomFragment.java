package com.example.furniture.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture.MAdapter;
import com.example.furniture.R;
import com.example.furniture.databinding.FragmentBedRoomBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvBedroom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_bedroom.add(new FurnitureModel("Спальные гарнитуры", "Кровать Лунный Свет", "1690",
                "Двуспальная кровать, размер 2.6м х 2.4м, производство Турция. Матрас набивной пружинный, отделка: белый блестящий лак, ткань бежевый велюр", R.drawable.bedroom_bed));
        list_bedroom.add(new FurnitureModel("Спальные гарнитуры", "Кровать Золотой Рассвет", "1100",
                "Двуспальная кровать, размер 2.6м х 2.4м, производство Италия. Отделка: натуральная кожа и атлас", R.drawable.bedroom_bed));
        list_bedroom.add(new FurnitureModel("Спальные гарнитуры", "Кровать Пленник", "1340",
                "Двуспальная кровать, размер 2.2м х 2.15м, производство Италия. Отделка: шелк", R.drawable.bedroom_bed));
        list_bedroom.add(new FurnitureModel("Спальные гарнитуры", "Кровать Парламент", "1200",
                "Двуспальная кровать, размер 2.2м х 2.4м, производство Италия. Отделка: белый блестящий лак, ткань бежевый велюр", R.drawable.bedroom_bed));
        list_bedroom.add(new FurnitureModel("Спальные гарнитуры", "Кровать Морской Бриз", "1690",
                "Двуспальная кровать, размер 2.6м х 2.4м, производство Турция. Матрас набивной пружинный, отделка: белый блестящий лак, ткань бежевый велюр", R.drawable.bedroom_bed));
        list_bedroom.add(new FurnitureModel("Спальные гарнитуры", "Кровать Рассвет", "1100",
                "Двуспальная кровать, размер 2.6м х 2.4м, производство Италия. Отделка: натуральная кожа и атлас", R.drawable.bedroom_bed));
        list_bedroom.add(new FurnitureModel("Спальные гарнитуры", "Кровать Земляника", "1340",
                "Двуспальная кровать, размер 2.2м х 2.15м, производство Италия. Отделка: шелк", R.drawable.bedroom_bed));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Французский Стиль", "1200",
                "Двуспальная кровать, размер 2.2м х 2.4м, производство Италия. Отделка: белый блестящий лак, ткань бежевый велюр", R.drawable.bedroom_bed));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}