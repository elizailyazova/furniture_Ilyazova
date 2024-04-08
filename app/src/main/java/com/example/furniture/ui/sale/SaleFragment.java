package com.example.furniture.ui.sale;

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
import com.example.furniture.R;
import com.example.furniture.databinding.FragmentSaleBinding;
import com.example.furniture.models.CategoryModel;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class SaleFragment extends Fragment {

    FragmentSaleBinding binding;
    NavController navController;
    List<FurnitureModel> list_s = new ArrayList<>();

    MAdapter adapter;

    public SaleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_s);
        binding.rvSale.setAdapter(adapter);
        return root;
    }




    private void createList() {
        list_s.add(new FurnitureModel("Кухня", "Кухонный гарнитур 'Солнечный день'", "980",
                "Материал - дерево сосны, покрытие - акриловая краска", "40%", R.drawable.kitchen_fur));
        list_s.add(new FurnitureModel("Кухня", "Стол и стулья для кухни 'Уютная обедня'", "380",
                "Материал - массив дуба, столешница - искусственный камень", "60%", R.drawable.kitchen_fur));
        list_s.add(new FurnitureModel("Спальня", "Кровать 'Лунная тень'", "280",
                "Материал - дерево бука, матрас - латексный", "55%", R.drawable.bedroom_bed));
        list_s.add(new FurnitureModel("Спальня", "Шкаф 'Спокойные сновидения'", "600",
                "Материал - ЛДСП, зеркало - закаленное стекло", "60%", R.drawable.bedroom_bed));
        list_s.add(new FurnitureModel("Детская", "Детская кровать 'Веселые мечты'", "780",
                "Материал - массив сосны, рисунок - ручная роспись", "45%", R.drawable.childrenroom_fur));
        list_s.add(new FurnitureModel("Детская", "Стол и стулья для учебы 'Учебный праздник'", "800",
                "Материал - пластик, высококачественный МДФ", "60%", R.drawable.childrenroom_fur));
        list_s.add(new FurnitureModel("Прихожая", "Шкаф для обуви 'Уютная приемная'", "660",
                "Материал - МДФ, дверцы - зеркало", "70%", R.drawable.hallway_fur));
        list_s.add(new FurnitureModel("Прихожая", "Вешалка 'Легкий путь'", "390",
                "Материал - дерево, крючки - металл", "60%", R.drawable.hallway_fur));
        list_s.add(new FurnitureModel("Зал", "Мягкий уголок 'Семейные вечера'", "1690",
                "Материал - натуральная кожа, наполнитель - пенополиуретан", "60%", R.drawable.zal_chair));
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_saleFragment_to_navigation_home);
        });

    }
}