package com.gritlab.test2.ui.landinghome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.gritlab.test2.R;

import org.imaginativeworld.whynotimagecarousel.CarouselItem;
import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

import java.util.ArrayList;
import java.util.List;

public class LandingHomeFragment extends Fragment {

    private LandingHomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(LandingHomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_landing_home, container, false);

       //set burger to open drawer
        final DrawerLayout drawerLayout = getActivity().findViewById(R.id.main_drawer_layout);
        ImageView burger = root.findViewById(R.id.burger_ikorodu);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        loadCarousel(root);
        return root;
    }

    private void loadCarousel(View root){
        ImageCarousel carousel = root.findViewById(R.id.carousel);
        List<CarouselItem> list = new ArrayList<>();
        list.add(new CarouselItem(
                "https://images.unsplash.com/photo-1581441117193-63e8f6547081?w=1080",
                "")
        );
        list.add(new CarouselItem(
                "https://images.unsplash.com/photo-1581441117193-63e8f6547081?w=1080",
                "")
        );
        list.add(new CarouselItem(
                "https://images.unsplash.com/photo-1581441117193-63e8f6547081?w=1080",
                "")
        );
        list.add(new CarouselItem(
                "https://images.unsplash.com/photo-1581441117193-63e8f6547081?w=1080",
                "")
        );
        carousel.addData(list);

    }
}