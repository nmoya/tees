package com.example.nmoya.tees;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;


/**
 * Created by nmoya on 7/11/15.
 */



public class AdapterListView extends ArrayAdapter<TShirt> {

    public AdapterListView(Context context, List<TShirt> allTShirts) {
        super(context, R.layout.item_list_view, allTShirts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.item_list_view, parent, false);

        TShirt tshirt = getItem(position);
        TextView url_label = (TextView) theView.findViewById(R.id.url_label_id);
        TextView price_label = (TextView) theView.findViewById(R.id.price_label_id);
        ImageView shirt_img = (ImageView) theView.findViewById(R.id.shirt_img_id);
        ImageView store_img = (ImageView) theView.findViewById(R.id.store_img_id);
        ImageView fav_img = (ImageButton) theView.findViewById((R.id.fav_img_id));

        url_label.setText(tshirt.getStore_url());
        float price = tshirt.getPrice();
        price_label.setText("$" + String.valueOf(price));

        new DownloadImageTask(shirt_img).execute(tshirt.getShirt_img_url());
        store_img.setImageResource(R.drawable.sample_store);

        if (tshirt.isFavourite())
            fav_img.setBackgroundResource(R.drawable.fav_on);
        else
            fav_img.setBackgroundResource(R.drawable.fav_off);

        return theView;
    }
}
