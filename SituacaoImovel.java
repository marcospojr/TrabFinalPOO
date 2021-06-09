public enum SituacaoImovel {

    ATIVO((byte)1),
    INATIVO((byte)2),
    EMUSO((byte)3);

    private final byte situacao;

    SituacaoImovel(byte situacao){
        this.situacao = situacao;
    }

    public byte getSituacao() {
        return situacao;
    }
}
