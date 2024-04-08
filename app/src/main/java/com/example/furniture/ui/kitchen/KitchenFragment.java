package com.example.furniture.ui.kitchen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniture.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture.MAdapter;
import com.example.furniture.databinding.FragmentKitchenBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class KitchenFragment extends Fragment {

    FragmentKitchenBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKitchenBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvKitchen.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kitchenFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Деревянный кухонный гарнитур", "980",
                "Изготовлен из древесины сосны, обработанной антисептиком", "40%", R.drawable.kitchen_fur));
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Металлический кухонный гарнитур", "380",
                "Изготовлен из стальных прутьев с порошковым покрытием", "60%", R.drawable.kitchen_fur));
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Каменный кухонный гарнитур", "280",
                "Строится из природного камня, выдерживает любые погодные условия", "55%", R.drawable.kitchen_fur));
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Живая кухонная изгородь", "600",
                "Состоит из живых растений, создает естественную границу", "60%", R.drawable.kitchen_fur));
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Кухонный гарнитур из бетонных блоков", "780",
                "Строительные блоки устойчивы к воздействию влаги и мороза", "45%", R.drawable.kitchen_fur));
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Кованый кухонный гарнитур", "800",
                "Изготавливается на заказ, имеет уникальный дизайн", "60%", R.drawable.kitchen_fur));
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Пластиковый кухонный гарнитур", "660",
                "Легкий в установке и уходе, устойчив к воздействию ультрафиолетовых лучей", "70%", R.drawable.kitchen_fur));
        list_g.add(new FurnitureModel("Кухонные гарнитуры", "Березовая кухонная скамья", "390",
                "Изготовлена из прочной березы, подходит для уличного использования", "60%", R.drawable.kitchen_fur));
    }
}