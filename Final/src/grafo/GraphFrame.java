/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import com.mxgraph.model.mxGraphModel;
import static javax.swing.JOptionPane.showMessageDialog;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Pablo
 */
public class GraphFrame extends javax.swing.JFrame {
   
    List<Double> xs = new ArrayList<Double>();
    List<Double> ys = new ArrayList<Double>();
    List<vertice> caminho = new ArrayList<vertice>();
    List<vertice> vertices = new ArrayList<vertice>();
    grafo ufu;
    mxGraph graph = new mxGraph();
    Object parent = graph.getDefaultParent();
    public GraphFrame() {
        initComponents();
        ufu = new grafo();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_grafo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jb_vert = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_a1 = new javax.swing.JTextField();
        jtf_a2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_ap = new javax.swing.JTextField();
        jb_ar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtf_dj1 = new javax.swing.JTextField();
        jtf_dj2 = new javax.swing.JTextField();
        jb_dij = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jb_ufu = new javax.swing.JButton();
        jb_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_dij = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_grafo.setBackground(new java.awt.Color(102, 102, 102));
        jp_grafo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jp_grafo.setAutoscrolls(true);
        jp_grafo.setMaximumSize(new java.awt.Dimension(792, 497));
        jp_grafo.setMinimumSize(new java.awt.Dimension(792, 497));
        jp_grafo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Adicionar Vertice");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("ID:");
        jLabel2.setToolTipText("");

        jtf_id.setPreferredSize(new java.awt.Dimension(50, 20));
        jtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_idActionPerformed(evt);
            }
        });

        jb_vert.setText("Insert");
        jb_vert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_vertActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Adicionar Aresta");

        jLabel4.setText("ID1:");

        jLabel5.setText("ID2:");

        jLabel6.setText("Peso:");

        jb_ar.setText("Apply");
        jb_ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_arActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Dijkastra");

        jLabel8.setText("ID1:");

        jLabel9.setText("ID2:");

        jb_dij.setText("Calcular");
        jb_dij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dijActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Grafo da UFU");

        jb_ufu.setText("Grafo UFU");
        jb_ufu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ufuActionPerformed(evt);
            }
        });

        jb_clear.setText("Limpar Grafo");
        jb_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clearActionPerformed(evt);
            }
        });

        jta_dij.setColumns(20);
        jta_dij.setRows(5);
        jScrollPane1.setViewportView(jta_dij);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jb_vert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtf_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_a1)
                                            .addComponent(jtf_a2)
                                            .addComponent(jtf_ap)
                                            .addComponent(jb_ar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb_dij, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_dj2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jb_ufu)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_dj1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(jp_grafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_vert)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_ap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_ar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_ufu)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_dj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_dj2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_dij)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jp_grafo, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_clear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_idActionPerformed

    private void jb_vertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_vertActionPerformed
        String id = jtf_id.getText();
        if(id.equals(""))
            showMessageDialog(null, "ID vazio!");
        else
        {    
                addVertex(id);
            }                     
    }//GEN-LAST:event_jb_vertActionPerformed

    private void jb_arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_arActionPerformed
        graph.getModel().beginUpdate();
        String a1 = jtf_a1.getText();
        String a2 = jtf_a2.getText();
        String ap = jtf_ap.getText();
        Object v1 = ((mxGraphModel)(graph.getModel())).getCell(a1);
        Object v2 = ((mxGraphModel)(graph.getModel())).getCell(a2);
        if(a1.equals("") && a2.equals(""))
            showMessageDialog(null, "ID's vazios!");
        else if(a1.equals("") )
            showMessageDialog(null, "ID1 vazio!");
        else if(a2.equals(""))
            showMessageDialog(null, "ID2 vazio!");
        else if(ap.equals(""))
            showMessageDialog(null, "Peso vazio!");
        else if(a1.equals(a2))
            showMessageDialog(null, "ID's iguais!");
        else
        {          
            int peso = Integer.parseInt(ap);
            if(ufu.addAresta(a1,a2,peso))
            {
                    if(v1 != null && v2 != null)
                        graph.insertEdge(parent, a1+" "+a2, ap, v1, v2,"fontSize=16;fontColor=black");  
                    else
                        showMessageDialog(null, "Aresta não foi criada, verifique os ID's!");                    
                
                limpaCampos();
            }
            else
                showMessageDialog(null, "Aresta não Adicionada!");
        }       
        revalida();
    }//GEN-LAST:event_jb_arActionPerformed

    
    private void jb_dijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dijActionPerformed
        String dj1 = jtf_dj1.getText();
        String dj2 = jtf_dj2.getText();
        if(dj1.equals("") && dj2.equals(""))
            showMessageDialog(null, "ID's vazios!");
        else if(dj1.equals("") )
            showMessageDialog(null, "ID1 vazio!");
        else if(dj2.equals(""))
            showMessageDialog(null, "ID2 vazio!");
        else if(dj1.equals(dj2))
            showMessageDialog(null, "ID's iguais!");
        else
        {
            //Era para resetar as cores de vetores
            
            graph.getModel().beginUpdate();
            String id;
            vertices = ufu.getMatrix();
            for(int i=0; i < vertices.size();i++)
            {
                id = vertices.get(i).getId();
                Object v = ((mxGraphModel)(graph.getModel())).getCell(id);
                ((mxGraphModel)(graph.getModel())).setStyle(v,"defaultVertex;fillColor=green;fontColor=black");
            }
            revalida();
            graph.getModel().beginUpdate();
            String id1;
            String ids ="";
            limpaCampos();

            //Muda cores dos vertices colorindo o caminho
            caminho = ufu.Dijkstra(dj1, dj2);
            if(caminho != null)
            {
            for(int i = 0; i < caminho.size(); i++)
            {
                if(i>0)
                    ids += " ---> ";
                ids += caminho.get(i).getId();
                id1 = caminho.get(i).getId();
                Object v = ((mxGraphModel)(graph.getModel())).getCell(id1);
                ((mxGraphModel)(graph.getModel())).setStyle(v,"defaultVertex;fillColor=red;fontSize=16;fontColor=black");
            }
            ids += "\nDistância: " + ufu.getDist();
            jta_dij.setText(ids);
        }
        }
        revalida();
    }//GEN-LAST:event_jb_dijActionPerformed

    private void jb_ufuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ufuActionPerformed
        ufu = new grafo();
        limpaCampos();
        graph.getModel().beginUpdate();
        graph.removeCells(graph.getChildVertices(graph.getDefaultParent()));
        revalida();
        addVertex("1U");
        addVertex("1N");
        addVertex("5R");
        addVertex("1C");
        addVertex("1G");
        addVertex("3Q");
        addVertex("3M");
        addVertex("1E");
        addAresta("1U","1N",35);
        addAresta("1U","5R",15);
        addAresta("5R","1C",15);
        addAresta("5R","1N",15);
        addAresta("5R","1G",80);
        addAresta("1E","1N",50);
        addAresta("1E","3M",25);
        addAresta("1E","3Q",98);
        addAresta("3Q","1G",39);
        addAresta("3M","1C",15);
        addAresta("3M","1N",35);
        addAresta("3M","3Q",35);
    }//GEN-LAST:event_jb_ufuActionPerformed

   
    private void jb_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clearActionPerformed

        limpaCampos();
        ufu.limpargrafo();
        graph.getModel().beginUpdate();
        graph.removeCells(graph.getChildVertices(graph.getDefaultParent()));
        revalida();
    }//GEN-LAST:event_jb_clearActionPerformed
    
    public void revalida()
    {
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        graph.getModel().endUpdate();
        jp_grafo.removeAll();
        jp_grafo.add(graphComponent);
        jp_grafo.revalidate();
        jp_grafo.repaint();
    }
    
    public void limpaCampos()
    {
        jtf_a1.setText("");
        jtf_a2.setText("");
        jtf_ap.setText("");
        jtf_dj1.setText("");
        jtf_dj2.setText("");
        jtf_id.setText("");
    }
    
     public void addVertex(String id)
    {
        ufu.addVertice(id);
        graph.getModel().beginUpdate();
        Random r = new Random();
        limpaCampos();
        Random ran = new Random();
        double x = ran.nextInt(700);
        double y = ran.nextInt(490);
        xs.add(1.0);
        ys.add(1.0);
        for(int i = 0; i < xs.size(); i++)
        {
            if(x == xs.get(i))
            {
                x = ran.nextInt(700);
                i=0;
            }
        }
        xs.add(x);
        for(int i = 0; i < ys.size(); i++)
        {
            if(y == ys.get(i))
            {
                y = ran.nextInt(490);
                i=0;
            }
        }
        ys.add(y);
        graph.insertVertex(parent, id, id, x, y, 80,30,"fontColor=black;fillColor=green;");
        graph.getModel().endUpdate();
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        jp_grafo.removeAll();
        jp_grafo.add(graphComponent);
        jp_grafo.revalidate();
        jp_grafo.repaint();   
    }
        
    public void addAresta(String a1,String a2, int peso)
    {
        ufu.addAresta(a1,a2,peso);
        Object v1 = ((mxGraphModel)(graph.getModel())).getCell(a1);
        Object v2 = ((mxGraphModel)(graph.getModel())).getCell(a2);
        graph.insertEdge(parent, "1U"+" "+"1N", peso, v1, v2,"fontSize=16;fontColor=black;strokeWidth=2;labelBackgroundColor=#ffffff;endArrow=none");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

									
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_ar;
    private javax.swing.JButton jb_clear;
    private javax.swing.JButton jb_dij;
    private javax.swing.JButton jb_ufu;
    private javax.swing.JButton jb_vert;
    private javax.swing.JPanel jp_grafo;
    private javax.swing.JTextArea jta_dij;
    private javax.swing.JTextField jtf_a1;
    private javax.swing.JTextField jtf_a2;
    private javax.swing.JTextField jtf_ap;
    private javax.swing.JTextField jtf_dj1;
    private javax.swing.JTextField jtf_dj2;
    private javax.swing.JTextField jtf_id;
    // End of variables declaration//GEN-END:variables
}
