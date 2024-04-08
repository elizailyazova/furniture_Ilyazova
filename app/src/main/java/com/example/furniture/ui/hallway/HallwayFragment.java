package com.example.furniture.ui.hallway;

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
import com.example.furniture.databinding.FragmentHallwayBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class HallwayFragment extends Fragment {
    private FragmentHallwayBinding binding;

    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHallwayBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvHallway.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_g.add(new FurnitureModel("Мебель для прихожей", "Деревянный прихожий гарнитур", "980",
                "Изготовлен из древесины сосны, обработанной антисептиком", "40%", R.drawable.hallway_fur));
        list_g.add(new FurnitureModel("Мебель для прихожей", "Металлическая прихожая мебель", "380",
                "Изготовлена из стальных прутьев с порошковым покрытием", "60%", R.drawable.hallway_fur));
        list_g.add(new FurnitureModel("Мебель для прихожей", "Каменная прихожая мебель", "280",
                "Строится из природного камня, выдерживает любые погодные условия", "55%", R.drawable.hallway_fur));
        list_g.add(new FurnitureModel("Мебель для прихожей", "Живая прихожая изгородь", "600",
                "Состоит из живых растений, создает естественную границу", "60%", R.drawable.hallway_fur));
        list_g.add(new FurnitureModel("Мебель для прихожей", "Прихожая мебель из бетонных блоков", "780",
                "Строительные блоки устойчивы к воздействию влаги и мороза", "45%", R.drawable.hallway_fur));
        list_g.add(new FurnitureModel("Мебель для прихожей", "Кованая прихожая мебель", "800",
                "Изготавливается на заказ, имеет уникальный дизайн", "60%", R.drawable.hallway_fur));
        list_g.add(new FurnitureModel("Мебель для прихожей", "Пластиковая прихожая мебель", "660",
                "Легкая в установке и уходе, устойчива к воздействию ультрафиолетовых лучей", "70%", R.drawable.hallway_fur));
        list_g.add(new FurnitureModel("Мебель для прихожей", "Березовая прихожая скамья", "390",
                "Изготовлена из прочной березы, подходит для уличного использования", "60%", R.drawable.hallway_fur));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_hallwayFragment_to_navigation_home);
        });



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}