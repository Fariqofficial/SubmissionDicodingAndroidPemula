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
import pradita.id.ac.submissiondicodingandroidpemula.model.Archer;

public class ArcherAdapter extends RecyclerView.Adapter<ArcherAdapter.ViewHolder> {

    private ArrayList<Archer> listArcher;

    public ArcherAdapter(ArrayList<Archer> listArcher) {
        this.listArcher = listArcher;
    }

    private ArcherAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ArcherAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hero_archer, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder (final ViewHolder holder, int position) {
        Archer archer = listArcher.get(position);
        Glide.with(holder.itemView.getContext())
                .load(archer.getImage_hero())
                .apply(new RequestOptions().override(75,75))
                .into(holder.imgHero);
        holder.namaArcher.setText(archer.getNama_archer());
        holder.roleHero.setText(archer.getRole_hero());
        holder.storyHero.setText(archer.getStory_archer());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listArcher.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Archer data);
    }

    @Override
    public int getItemCount() {
        return listArcher.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgHero;
        TextView namaArcher, roleHero, storyHero;

        public ViewHolder(View itemView) {
            super(itemView);
            imgHero = itemView.findViewById(R.id.img_archer);
            namaArcher = itemView.findViewById(R.id.namaArcher);
            roleHero = itemView.findViewById(R.id.roleHero);
            storyHero = itemView.findViewById(R.id.kisahArcher);
        }
    }
}
