
package com.example.furniture.ui.notifications;

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
import com.example.furniture.databinding.FragmentZalBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {
    private FragmentZalBinding binding;

    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvZal.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_g.add(new FurnitureModel("Мебель для зала", "Кресло Луна",
                "1060", "Кресло с изящным дизайном и удобными подушками, производство Швеция, долговечные материалы", R.drawable.zal_chair));
        list_g.add(new FurnitureModel("zal", "Кресло Космос",
                "2060", "Кресло с мягким сиденьем и подлокотниками, производство Швеция, устойчивая конструкция", R.drawable.zal_chair));
        list_g.add(new FurnitureModel("Мебель для зала", "Кресло Небеса",
                "8360", "Кресло с комфортабельной спинкой и мягкими подушками, производство Швеция, стильный дизайн", R.drawable.zal_chair));
        list_g.add(new FurnitureModel("Мебель для зала", "Кресло Вечерняя Звезда",
                "8480", "Кресло с эргономичным дизайном и удобными подлокотниками, производство Швеция, качественные материалы", R.drawable.zal_chair));
        list_g.add(new FurnitureModel("Мебель для зала", "Кресло Солнце",
                "1900", "Кресло с высокой спинкой и удобной посадкой, производство Швеция, прочная конструкция", R.drawable.zal_chair));
        list_g.add(new FurnitureModel("Мебель для зала", "Кресло Закат",
                "860", "Кресло с изящным дизайном и удобными подушками, производство Швеция, долговечные материалы", R.drawable.zal_chair));
        list_g.add(new FurnitureModel("Мебель для зала", "Кресло Рассвет",
                "4070", "Кресло с мягкой обивкой и стильным дизайном, производство Швеция, удобное сидение", R.drawable.zal_chair));
        list_g.add(new FurnitureModel("Мебель для зала", "Кресло Лучи Солнца",
                "1000", "Кресло с элегантным внешним видом и комфортной посадкой, производство Швеция, прочная и надежная конструкция", R.drawable.zal_chair));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_zal_to_navigation_home);
        });



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}