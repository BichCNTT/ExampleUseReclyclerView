package com.example.ominext.exampleuserecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ominext on 7/13/2017.
 */
public class AdapterRecyclerView extends android.support.v7.widget.RecyclerView.Adapter<AdapterRecyclerView.RecyclerViewHolder> {
    private List<TitleAndContent> listData = new ArrayList<>();
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterRecyclerView(Context context, List<TitleAndContent> listData) {
        this.listData = listData;
        this.context=context;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item, parent, false);
        //trả về 1 view trong view có chứa txtHeader
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txtHeader.setText(listData.get(position).getTitle());
        holder.txtContent.setText(listData.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtHeader;
        TextView txtContent;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtHeader = (TextView) itemView.findViewById(R.id.txtHeader);
            txtContent = (TextView) itemView.findViewById(R.id.txtContent);
        }
    }

}
