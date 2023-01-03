package com.cpdias.autofac;

import java.util.ArrayList;
import java.util.List;

class OriginDao {
    
    public List<Origin>getOrigins(){
        List<Origin>origins = new ArrayList<>();
        
        origins.add(fromElectricDreams());
        origins.add(fromStarTrek());
        origins.add(fromTwilightZone());
        
        return origins;
    }
    
    
    private Origin fromElectricDreams(){
        Origin originsFromElectricDreams = new Origin("Electric Dreams");
        originsFromElectricDreams.addTale(new Tale("Autofac", "https://www.youtube.com/watch?v=R0QCN96-JrE", "A sociedade e o mundo como o conhecemos entraram em colapso. Uma enorme fábrica automática opera de acordo com os princípios do consumismo; os humanos consomem para serem felizes e, para consumir continuamente, devem ser negados a liberdade de escolha e o livre arbítrio. Quando um pequeno grupo de rebeldes decide fechar a fábrica, eles descobrem que, afinal, podem ser os consumidores perfeitos."));
        return originsFromElectricDreams;
    }
    
    private Origin fromStarTrek() {
        Origin origins = new Origin("Star Trek");
        origins.addTale(new Tale("Arena", "https://pt.wikipedia.org/wiki/Arena_(Star_Trek)", "O capitão Kirk é forçado por entidades poderosas a batalhar contra o capitão de uma nave inimiga para definir o destino das duas naves. A vencedora poderá partir, a perdedora será destruída. "));
        origins.addTale(new Tale("Catspaw", "https://www.youtube.com/watch?v=5LiDn5_gt50", "A tripulação da Enterprise encontra dois alienígenas de outra galáxia com poderes aparentemente mágicos. Este episódio foi o primeiro filmado para incluir Pavel Chekov regular da série (Walter Koenig), embora tenha sido transmitido depois que vários outros episódios com o personagem já foram ao ar; a exibição foi adiada para coincidir com o Halloween."));
        origins.addTale(new Tale("Metamorphosis", "https://www.youtube.com/watch?v=w1JOfpmraJg", "Ao voltar para a Enterprise a bordo do ônibus espacial, Kirk, Spock, McCoy e um diplomata da Federação gravemente doente se veem sequestrados por uma nuvem de energia."));
        origins.addTale(new Tale("Obsession", "https://www.youtube.com/watch?v=UhRwdRwgrbw", "O Capitão Kirk fica obcecado em destruir uma entidade assassina que matou grande parte da tripulação de sua nave anterior."));
        
        return origins;
        
    }
    
    private Origin fromTwilightZone() {
        Origin origins = new Origin("Twilight Zone");
        origins.addTale(new Tale("Elegy", "https://www.youtube.com/watch?v=HXqQewR0hoE", "O capitão Kirk é forçado por entidades poderosas a batalhar contra o capitão de uma nave inimiga para definir o destino das duas naves. A vencedora poderá partir, a perdedora será destruída. "));
        origins.addTale(new Tale("Execution", "https://www.youtube.com/watch?v=P_ayqthlbis", "A tripulação da Enterprise encontra dois alienígenas de outra galáxia com poderes aparentemente mágicos. Este episódio foi o primeiro filmado para incluir Pavel Chekov regular da série (Walter Koenig), embora tenha sido transmitido depois que vários outros episódios com o personagem já foram ao ar; a exibição foi adiada para coincidir com o Halloween."));
        origins.addTale(new Tale("Dust", "https://www.youtube.com/watch?v=w1JOfpmraJg", "Ao voltar para a Enterprise a bordo do ônibus espacial, Kirk, Spock, McCoy e um diplomata da Federação gravemente doente se veem sequestrados por uma nuvem de energia."));
        origins.addTale(new Tale("Two", "https://www.youtube.com/watch?v=UhRwdRwgrbw", "O Capitão Kirk fica obcecado em destruir uma entidade assassina que matou grande parte da tripulação de sua nave anterior."));
        
        origins.addTale(new Tale("Mute", "https://pt.wikipedia.org/wiki/Arena_(Star_Trek)", "O capitão Kirk é forçado por entidades poderosas a batalhar contra o capitão de uma nave inimiga para definir o destino das duas naves. A vencedora poderá partir, a perdedora será destruída. "));
        origins.addTale(new Tale("Miniature", "https://www.youtube.com/watch?v=5LiDn5_gt50", "A tripulação da Enterprise encontra dois alienígenas de outra galáxia com poderes aparentemente mágicos. Este episódio foi o primeiro filmado para incluir Pavel Chekov regular da série (Walter Koenig), embora tenha sido transmitido depois que vários outros episódios com o personagem já foram ao ar; a exibição foi adiada para coincidir com o Halloween."));
        origins.addTale(new Tale("Steel", "https://www.youtube.com/watch?v=w1JOfpmraJg", "Ao voltar para a Enterprise a bordo do ônibus espacial, Kirk, Spock, McCoy e um diplomata da Federação gravemente doente se veem sequestrados por uma nuvem de energia."));
        origins.addTale(new Tale("Shatterday", "https://www.youtube.com/watch?v=UhRwdRwgrbw", "O Capitão Kirk fica obcecado em destruir uma entidade assassina que matou grande parte da tripulação de sua nave anterior."));
        
        origins.addTale(new Tale("Chameleon", "https://www.youtube.com/watch?v=w1JOfpmraJg", "Ao voltar para a Enterprise a bordo do ônibus espacial, Kirk, Spock, McCoy e um diplomata da Federação gravemente doente se veem sequestrados por uma nuvem de energia."));
        origins.addTale(new Tale("Nightcrawlers", "https://www.youtube.com/watch?v=UhRwdRwgrbw", "O Capitão Kirk fica obcecado em destruir uma entidade assassina que matou grande parte da tripulação de sua nave anterior."));
        
        
        return origins;
        
    }
    //Twilight_Zone
}
