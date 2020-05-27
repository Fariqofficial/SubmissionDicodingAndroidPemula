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
import pradita.id.ac.submissiondicodingandroidpemula.model.Support;

public class SupportAdapter extends RecyclerView.Adapter<SupportAdapter.ViewHolder> {

    private ArrayList<Support> listSupport;

    public SupportAdapter(ArrayList<Support> listSupport) {
        this.listSupport = listSupport;
    }

    private SupportAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(SupportAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hero_support, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Support support = listSupport.get(position);
        Glide.with(holder.itemView.getContext())
                .load(support.getSupportImage())
                .apply(new RequestOptions().override(75,75))
                .into(holder.imageHeroSup);
        holder.namaHeroSup.setText(support.getNamaHeroSup());
        holder.roleHeroSup.setText(support.getRoleHeroSup());
        holder.storySupport.setText(support.getStoryHeroSup());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSupport.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Support data);
    }

    @Override
    public int getItemCount() {
        return listSupport.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageHeroSup;
        TextView namaHeroSup, roleHeroSup, storySupport;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           imageHeroSup = itemView.findViewById(R.id.supportImage);
           namaHeroSup= itemView.findViewById(R.id.heroSupport);
           roleHeroSup = itemView.findViewById(R.id.roieSupport);
           storySupport = itemView.findViewById(R.id.kisahSupport);
        }
    }
}
