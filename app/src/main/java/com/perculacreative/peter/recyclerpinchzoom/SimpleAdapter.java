package com.perculacreative.peter.recyclerpinchzoom;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ItemHolder> {

    private int mCount;

    public SimpleAdapter(int count) {
        mCount = count;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup container, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View root = inflater.inflate(R.layout.item_view, container, false);

        return new ItemHolder(root);
    }

    @Override
    public void onBindViewHolder(ItemHolder itemHolder, int position) {
        itemHolder.mId.setText(Integer.toString(position));
    }

    @Override
    public int getItemCount() {
        return mCount;
    }


    public static class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mId;

        public ItemHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mId = (TextView) itemView.findViewById(R.id.id);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), mId.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
