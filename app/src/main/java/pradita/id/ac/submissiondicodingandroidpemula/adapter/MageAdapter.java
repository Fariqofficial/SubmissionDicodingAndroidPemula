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
import pradita.id.ac.submissiondicodingandroidpemula.model.Mage;

public class MageAdapter extends RecyclerView.Adapter<MageAdapter.ViewHolder> {

    private ArrayList<Mage> listMage;

    public MageAdapter(ArrayList<Mage> listMage) {
        this.listMage = listMage;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hero_mage, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Mage mage = listMage.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mage.getGambarMage())
                .apply(new RequestOptions().override(75,75))
                .into(holder.image_mage);
        holder.hero_mage.setText(mage.getHero_mage());
        holder.roleMage.setText(mage.getRole_mage());
        holder.storyMage.setText(mage.getKisah_mage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMage.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Mage data);
    }

    @Override
    public int getItemCount() {
        return listMage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_mage;
        TextView hero_mage, roleMage, storyMage;

        public ViewHolder(View itemView) {
            super(itemView);

            image_mage = itemView.findViewById(R.id.pictureMage);
            hero_mage = itemView.findViewById(R.id.nama_mage);
            roleMage = itemView.findViewById(R.id.roie_mage);
            storyMage = itemView.findViewById(R.id.mageStory);
        }
    }
}
