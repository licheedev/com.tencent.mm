.class final Lcom/tencent/mm/plugin/music/a/c/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/mm/plugin/music/a/c/a;->dB(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic foA:Lcom/tencent/mm/plugin/music/a/c/a;

.field final synthetic foz:Z


# direct methods
.method constructor <init>(Lcom/tencent/mm/plugin/music/a/c/a;Z)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/tencent/mm/plugin/music/a/c/a$1;->foA:Lcom/tencent/mm/plugin/music/a/c/a;

    iput-boolean p2, p0, Lcom/tencent/mm/plugin/music/a/c/a$1;->foz:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 49
    const-string/jumbo v0, "MicroMsg.Music.BasePlayer"

    const-string/jumbo v1, "onError"

    invoke-static {v0, v1}, Lcom/tencent/kingkong/support/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/tencent/mm/plugin/music/a/c/a$1;->foA:Lcom/tencent/mm/plugin/music/a/c/a;

    iget-object v0, v0, Lcom/tencent/mm/plugin/music/a/c/a;->fox:Lcom/tencent/mm/plugin/music/a/c/d;

    iget-object v1, p0, Lcom/tencent/mm/plugin/music/a/c/a$1;->foA:Lcom/tencent/mm/plugin/music/a/c/a;

    iget-object v1, v1, Lcom/tencent/mm/plugin/music/a/c/a;->aok:Lcom/tencent/mm/ai/a;

    iget-boolean v2, p0, Lcom/tencent/mm/plugin/music/a/c/a$1;->foz:Z

    invoke-interface {v0, v1, v2}, Lcom/tencent/mm/plugin/music/a/c/d;->c(Lcom/tencent/mm/ai/a;Z)V

    .line 51
    return-void
.end method
