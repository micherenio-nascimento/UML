class Notificacao {

    public void enviarMensagem(Mensagem msg){
        var newMsg = msg.getMensagem().toUpperCase();
        System.out.println("ENVIANDO: "+newMsg);
    }

}