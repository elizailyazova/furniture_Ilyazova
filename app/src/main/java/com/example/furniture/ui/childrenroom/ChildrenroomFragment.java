package com.example.furniture.ui.childrenroom;

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
import com.example.furniture.databinding.FragmentChildrenroomBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

    public class ChildrenroomFragment extends Fragment {
    private FragmentChildrenroomBinding binding;

    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentChildrenroomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvChildrenRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Деревянная юношеская гарнитура", "980",
                "Изготовлена из древесины сосны, подходит для подростков", "40%", R.drawable.childrenroom_fur));
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Металлическая юношеская гарнитура", "380",
                "Изготовлена из стальных прутьев, стильный дизайн", "60%", R.drawable.childrenroom_fur));
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Пластиковая юношеская гарнитура", "280",
                "Легкая и удобная, подходит для активных подростков", "55%", R.drawable.childrenroom_fur));
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Кованая юношеская гарнитура", "600",
                "Изготавливается на заказ, имеет уникальный дизайн", "60%", R.drawable.childrenroom_fur));
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Мебель для игровой комнаты", "780",
                "Создана для развлечений и отдыха подростков", "45%", R.drawable.childrenroom_fur));
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Мягкая юношеская мебель", "800",
                "Удобная и стильная, идеально подходит для отдыха", "60%", R.drawable.childrenroom_fur));
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Стол и стулья для учебы", "660",
                "Предназначены для занятий и учебы", "70%", R.drawable.childrenroom_fur));
        list_g.add(new FurnitureModel("Юношеские гарнитуры", "Кресло-мешок", "390",
                "Подходит для расслабления и отдыха", "60%", R.drawable.childrenroom_fur));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_childrenroomFragment_to_navigation_home);
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
