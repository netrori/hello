package com.abdelah.nav_bar_bottom.ui.chat;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abdelah.nav_bar_bottom.R;
import com.abdelah.nav_bar_bottom.databinding.FragmentChatBinding;
import com.abdelah.nav_bar_bottom.databinding.FragmentFinditBinding;
import com.abdelah.nav_bar_bottom.ui.findit.FinditViewModel;

public class ChatFragment extends Fragment {

//    private TextView tvChat;

    private ChatViewModel finditViewModel;
    private FragmentChatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        finditViewModel =
                new ViewModelProvider(this).get(ChatViewModel.class);

        binding = FragmentChatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvChat;
        finditViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}