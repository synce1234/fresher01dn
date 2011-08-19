USE [Java_FinalTest_LongNX]
GO
/****** Object:  Table [dbo].[bee]    Script Date: 08/19/2011 09:16:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[bee](
    [id] [int] IDENTITY(1,1) NOT NULL,
    [type] [nvarchar](50) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
    [health] [decimal](4, 2) NOT NULL,
    [deadline] [int] NOT NULL,
    [dead] [bit] NOT NULL,
 CONSTRAINT [PK_Bee] PRIMARY KEY CLUSTERED 
(
    [id] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
