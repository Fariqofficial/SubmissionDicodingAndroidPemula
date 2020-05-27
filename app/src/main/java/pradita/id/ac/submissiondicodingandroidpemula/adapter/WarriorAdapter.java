package pradita.id.ac.submissiondicodingandroidpemula.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.R;
import pradita.id.ac.submissiondicodingandroidpemula.model.Warrior;

public class WarriorAdapter extends RecyclerView.Adapter<WarriorAdapter.ViewHolder> {

    private ArrayList<Warrior> warriorlist;

    public WarriorAdapter(ArrayList<Warrior> warriorlist) {
        this.warriorlist = warriorlist;
    }

    private WarriorAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(WarriorAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hero_warrior, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Warrior warrior = warriorlist.get(position);
        Glide.with(holder.itemView.getContext())
                .load(warrior.getGambarHeroWarrior())
                .apply(new RequestOptions().override(75,75))
                .into(holder.warriorImage);
        holder.warriorName.setText(warrior.getHeroWarrior());
        holder.warriorRole.setText(warrior.getRoleWarrior());
        holder.warriorStory.setText(warrior.getStoryHeroWarrior());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(warriorlist.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Warrior data);
    }

    @Override
    public int getItemCount() {
        return warriorlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView warriorImage;
        TextView warriorName, warriorRole, warriorStory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            warriorImage = itemView.findViewById(R.id.imgWarrior);
            warriorName= itemView.findViewById(R.id.namaHeroWarrior);
            warriorRole = itemView.findViewById(R.id.roieHeroWarrior);
            warriorStory = itemView.findViewById(R.id.kisahHeroWarrior);
        }
    }
}
