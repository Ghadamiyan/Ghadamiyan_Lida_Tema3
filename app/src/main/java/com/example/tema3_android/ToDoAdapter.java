package com.example.tema3_android;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<ToDo> mExampleList;

    public ToDoAdapter(Context context, ArrayList<ToDo> exampleList) {
        mContext = context;
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.todo, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, final int position) {
        ToDo currentItem = mExampleList.get(position);

        String userId = currentItem.getUserId();
        String id = currentItem.getId();
        String title = currentItem.getTitle();
        String completed = currentItem.getCompleted();

        holder.muserId.setText(userId);
        holder.mid.setText(id);
        holder.mtitle.setText(title);
        holder.mcompleted.setText(completed);

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {

        public TextView muserId;
        public TextView mid;
        public TextView mtitle;
        public TextView mcompleted;

        public ExampleViewHolder(View itemView) {
            super(itemView);

            muserId = itemView.findViewById(R.id.text_view_userid);
            mid = itemView.findViewById(R.id.text_view_id);
            mtitle = itemView.findViewById(R.id.text_view_title);
            mcompleted = itemView.findViewById(R.id.text_view_completed);
        }
    }
}
