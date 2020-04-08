package com.example.tema3_android;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<User> mExampleList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public UserAdapter(Context context, ArrayList<User> exampleList) {
        mContext = context;
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.user, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        User currentItem = mExampleList.get(position);

        String Id = currentItem.getId();
        String Name = currentItem.getName();
        String UserName = currentItem.getUserName();
        String Email = currentItem.getMail();


        holder.mId.setText(Id);
        holder.mName.setText(Name);
        holder.mUserName.setText(UserName);
        holder.mEmail.setText(Email);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {

        public TextView mId;
        public TextView mName;
        public TextView mUserName;
        public TextView mEmail;


        public ExampleViewHolder(View itemView) {
            super(itemView);
            mId = itemView.findViewById(R.id.text_view_id);
            mName = itemView.findViewById(R.id.text_view_name);
            mUserName = itemView.findViewById(R.id.text_view_username);
            mEmail = itemView.findViewById(R.id.text_view_email);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
