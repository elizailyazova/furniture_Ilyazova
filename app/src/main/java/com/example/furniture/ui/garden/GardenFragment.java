package com.example.furniture.ui.garden;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniture.MAdapter;
import com.example.furniture.R;
import com.example.furniture.databinding.FragmentGardenBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    FragmentGardenBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGardenBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvGarden.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_gardenFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Товары для сада", "Деревянный забор", "980",
                "Материал - древесина сосны, обработана антисептиком", "40%", R.drawable.garden_fence));
        list_g.add(new FurnitureModel("Товары для сада", "Металлический забор", "380",
                "Изготовлен из стальных прутьев с порошковым покрытием", "60%", R.drawable.garden_fence));
        list_g.add(new FurnitureModel("Товары для сада", "Каменный забор", "280",
                "Строится из природного камня, выдерживает любые погодные условия", "55%", R.drawable.garden_fence));
        list_g.add(new FurnitureModel("Товары для сада", "Живая изгородь", "600",
                "Состоит из живых растений, создает естественную границу", "60%", R.drawable.garden_fence));
        list_g.add(new FurnitureModel("Товары для сада", "Забор из бетонных блоков", "780",
                "Строительный блоки устойчивы к воздействию влаги и мороза", "45%", R.drawable.garden_fence));
        list_g.add(new FurnitureModel("Товары для сада", "Кованый забор", "800",
                "Изготавливается на заказ, имеет уникальный дизайн", "60%", R.drawable.garden_fence));
        list_g.add(new FurnitureModel("Товары для сада", "Пластиковый забор", "660",
                "Легкий в установке и уходе, устойчив к воздействию ультрафиолетовых лучей", "70%", R.drawable.garden_fence));
        list_g.add(new FurnitureModel("Товары для сада", "Березовая скамья", "390",
                "Изготовлена из прочной березы, подходит для уличного использования", "60%", R.drawable.garden_fence));
    }
}