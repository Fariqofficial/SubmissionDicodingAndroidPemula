package pradita.id.ac.submissiondicodingandroidpemula.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.R;
import pradita.id.ac.submissiondicodingandroidpemula.model.Tank;

public class TankAdapter extends RecyclerView.Adapter<TankAdapter.ViewHolder> {

    private ArrayList<Tank> listTank;

    public TankAdapter(ArrayList<Tank> listTank) {
        this.listTank = listTank;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hero_tank, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Tank tank = listTank.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tank.getPictHeroTank())
                .apply(new RequestOptions().override(75,75))
                .into(holder.pictureTank);
        holder.nama_hero.setText(tank.getHeroTank());
        holder.role_tank.setText(tank.getRoleTank());
        holder.kisah_hero.setText(tank.getStoryHeroTank());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listTank.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Tank data);
    }

    @Override
    public int getItemCount() {
        return listTank.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pictureTank;
        TextView nama_hero, role_tank, kisah_hero;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pictureTank = itemView.findViewById(R.id.pictTank);
            nama_hero = itemView.findViewById(R.id.namaTank);
            role_tank = itemView.findViewById(R.id.roieTank);
            kisah_hero = itemView.findViewById(R.id.tankStory);
        }
    }
}
