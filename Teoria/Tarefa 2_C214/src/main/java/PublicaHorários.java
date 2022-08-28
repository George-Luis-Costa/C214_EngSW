import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class PublicaHorários {
    HoráriosServices horáriosServices;

    public PublicaHorários(HoráriosServices service) {
        this.horáriosServices = service;
    }

    public HoráriosPOJO publicaHorários(int id) {
        String HoráriosPOJOJson = horáriosServices.busca(id);

        JsonObject jsonObject = JsonParser.parseString(HoráriosPOJOJson).getAsJsonObject();

        return new HoráriosPOJO(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsInt());
    }

    public boolean vazio(int length) {
        return horáriosServices.vazio(length);
    }

    public boolean verificaSala(int sala) {
        boolean salaAllow = horáriosServices.rangeSala(sala);
        return salaAllow;
    }

    public boolean trocaSala(int profSalaA, int profSalaB) {
        boolean troca = horáriosServices.trocarSala(profSalaA, profSalaB);
        return troca;
    }
}
